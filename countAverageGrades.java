
// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 12
// IDE:  jGrasp

import java.util.InputMismatchException;
import java.util.Scanner;

public class countAverageGrades {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String another = "Y";
		int stuGrades = 0;

		// sentinel loop
		while (another.equalsIgnoreCase("Y")) {
			int classSize = 0;
			// user input for class size & use 'try catch' to limit user input to only integers
			while (true) {
				System.out.print("Enter class size:\t\t");
				try {
					classSize = scan.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("");
					System.out.println("Please enter Integer");
					scan.nextLine();
				}
			}

			int[] mGrades = new int[classSize];
			
			// user input for grades & use 'try catch' to limit user input to only integers
			while (true) {
				System.out.print("Entered grades (between 0 and 100):\t\t");
				// assigning each input to array
				try {
					for (int i = 0; i < classSize; i++) {
						stuGrades = scan.nextInt();
						mGrades[i] = stuGrades;
					}
					break;
				} catch (InputMismatchException e) {
					System.out.println("");
					System.out.println("Please enter Integer");
					scan.nextLine();
				}
			}

			double classAvg = averageGrade(mGrades, classSize);

			// outputs
			System.out.println("");
			System.out.println("Class size:\t\t\t" + classSize);
			System.out.print("Entered grades:\t");
			for (int i = 0; i < classSize; i++)
				System.out.print(mGrades[i] + " ");
			System.out.println("");
			System.out.printf("Class average:\t\t" + "%.2f", classAvg);

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

	public static double averageGrade(int[] mGrades, int classSize) {

		if (classSize == 0)
			return 0;
		else if (classSize == 1)
			return mGrades[classSize - 1];
		else
			return ((classSize - 1) * averageGrade(mGrades, classSize - 1) + mGrades[classSize - 1]) / classSize;
		
	}
}