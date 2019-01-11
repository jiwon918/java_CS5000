// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 10
// IDE:  jGrasp 

import java.util.*;

public class testTriangle {

	public static void main(String[] args) {

		double side1;
		double side2;
		double side3;
		String another = "Y";
		String triName;
		Scanner scan = new Scanner(System.in);

		while (another.equalsIgnoreCase("Y")) {

			// user input
			System.out.print("Enter the namne of the Triangle:\t");
			triName = scan.next();
			scan.nextLine();

			while (true) // get the number of side1 with error check (input validation)
			{
				System.out.print("Enter side 1 of the Triangle:\t");
				side1 = scan.nextDouble();
				scan.nextLine();
				if (side1 > 0)
					break;
			}
			while (true) // get the number of side2 with error check (input validation)
			{
				System.out.print("Enter side 2 of the Triangle:\t");
				side2 = scan.nextDouble();
				scan.nextLine();
				if (side2 > 0)
					break;
			}
			while (true) // get the number of side3 with error check (input validation)
			{
				System.out.print("Enter side 3 of the Triangle:\t");
				side3 = scan.nextDouble();
				scan.nextLine();
				if (side3 > 0)
					break;
			}
			System.out.println("");

			Triangle myTriangle = new Triangle(triName, side1, side2, side3);

			// print the triangle info
			System.out.print(myTriangle);

			System.out.println("");
			System.out.print("Try again (Y/N) ?\t");
			another = scan.next();
			scan.nextLine();
			System.out.println("");

		}
		System.out.println("Program terminated");
		scan.close();

	}

}