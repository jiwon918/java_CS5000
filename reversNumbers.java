// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 12
// IDE:  jGrasp
import java.util.*;
import java.lang.*;

public class reversNumbers {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String another = "Y";

		// sentinel loop
		while (another.equalsIgnoreCase("Y")) {
			int inputNum = 0;
			int[] numbers = new int[5];
			int[] reversedNum = new int[5];

			// user input & use 'try catch' to limit user input to only integers
			while (true) {
				System.out.println("Enter five positive integer numbers:\t\t");
				try {
					for (int i = 0; i < 5; i++) {
						inputNum = scan.nextInt();
						numbers[i] = inputNum;
					}
					break;
				} catch (InputMismatchException e) {
					System.out.println("");
					System.out.println("Please enter Integer");
					scan.nextLine();
				}
			}
			
			System.out.print("Entered numbers:\t");
			for (int i = 0; i < 5; i++)
				System.out.print(numbers[i] + " ");

			System.out.println("");

			for (int i = 0; i < 5; i++) {
				reversedNum[i] = reverse(numbers[i]);
			}
			
			System.out.print("Reversed numbers:\t");
			for (int i = 0; i < 5; i++)
				System.out.print(reversedNum[i] + " ");


			System.out.println("");
			System.out.println("");
			System.out.print("Try again (Y/N) ?\t");
			another = scan.next();
			scan.nextLine();
			System.out.println("");
		}
		System.out.println("Program terminated");
		scan.close();
	}

	public static int reverse(int numbers) {
		int n = numbers;
		int count = 0;

		if (numbers % 10 == 0)
			return numbers;

		while (n != 0) {
			n = n / 10;
			count++;
		}
		return (int) (numbers % 10 * Math.pow(10, count - 1) + reverse(numbers / 10));

	}
}

