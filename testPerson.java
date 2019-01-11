// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 10
// IDE:  jGrasp 

import java.util.*;

public class testPerson {

	public static void main(String[] args) {
		// declare variables
		String name = "";
		String address = "";
		String phoneNumber = "";
		String stuClass = "";
		int stuYear = 0;
		double emSalary = 0.0;
		String visitPurpose = "";
		String officeNum = "";
		String facultyRank = "";
		String Title = "";
		Person yourPerson = new Person();
		Student yourStudent = new Student();
		Employee yourEmployee = new Employee();
		Visitor yourVisitor = new Visitor();
		Faculty yourFaculty = new Faculty();
		Staff yourStaff = new Staff();

		String another = "Y";
		Scanner scan = new Scanner(System.in);

		// sentinel loop
		while (another.equalsIgnoreCase("Y")) {

			// getting user input

			for (int i = 1; i < 7; i++) {

				if (i == 1) {
					System.out.println("Enter info of a person");
				}

				else if (i == 2) {
					System.out.println("Enter info of a student");
				}

				else if (i == 3) {
					System.out.println("Enter info of an employee");
				} else if (i == 4) {
					System.out.println("Enter info of a visitor");
				}

				else if (i == 5) {
					System.out.println("Enter info of a faculty");
				} else if (i == 6) {
					System.out.println("Enter info of a staff");
				}

				System.out.print("Enter your name: \t\t");
				name = scan.next();
				scan.nextLine();

				System.out.print("Enter your address: \t\t");
				address = scan.next();
				scan.nextLine();

				System.out.print("Enter your phone number: \t");
				phoneNumber = scan.next();
				scan.nextLine();

				if (i == 2) {
					while (true) {
						System.out.print(
								"Enter your year (enter 1 for Freshment, 2 for Sophomore, 3 for Junior, 4 for Senior): \t");
						stuYear = scan.nextInt();
						scan.nextLine();
						if (stuYear > 0 && stuYear < 5) {
							if (stuYear == 1)
								stuClass = "Freshmen";
							else if (stuYear == 2)
								stuClass = "Sophomore";
							else if (stuYear == 3)
								stuClass = "Junior";
							else if (stuYear == 4)
								stuClass = "Senior";

							break;
						}
					}
				}
				if (i == 3 || i == 5 || i == 6) {
					while (true) {
						System.out.print("Enter your salary: \t\t");
						emSalary = scan.nextDouble();
						scan.nextLine();
						if (emSalary > 0)
							break;
					}
				}
				if (i == 4) {

					System.out.print("Enter your visiting purpose: \t");
					visitPurpose = scan.next();
					scan.nextLine();
				}
				if (i == 5) {
					System.out.print("Enter your office number: \t");
					officeNum = scan.next();
					scan.nextLine();

					System.out.print(
							"Enter your rank (enter 1 for Assistant Professor, 2 for Associate Professor, 3 for Full Professor): \t");
					int rank = scan.nextInt();
					scan.nextLine();

					while (true) {
						if (rank > 0 && rank < 4) {
							if (rank == 1)
								facultyRank = "Assistant Professor";
							else if (rank == 2)
								facultyRank = "Associate Professor";
							else if (rank == 3)
								facultyRank = "Full Professor";

							break;
						}
					}
				}
				if (i == 6) {
					System.out.print(
							"Enter your job (enter 1 for Advisor, 2 for Accountant, 3 for Painter, 4 for Manager, 5 for etc): \t");
					int job = scan.nextInt();
					scan.nextLine();
					if (job > 0 && job < 6) {
						if (job == 1)
							Title = "Advisor";
						else if (job == 2)
							Title = "Accountant";
						else if (job == 3)
							Title = "Painter";
						else if (job == 4)
							Title = "Manager";
						else if (job == 5)
							Title = "etc";
					}
				}

				/*
				 * System.out.
				 * print("Choose and enter appropriate number (1 for person, 2 for student, 3 for employee, 4 for visitor, 5 for faculty, 6 for staff): \t"
				 * ); int uChoose = scan.nextInt();
				 * 
				 */

				if (i == 1) {
					yourPerson = new Person(name, address, phoneNumber);
				}

				else if (i == 2) {
					yourStudent = new Student(name, address, phoneNumber, stuClass);
				}

				else if (i == 3) {
					yourEmployee = new Employee(name, address, phoneNumber, emSalary);
				} else if (i == 4) {
					yourVisitor = new Visitor(name, address, phoneNumber, visitPurpose);
				}

				else if (i == 5) {
					yourFaculty = new Faculty(name, address, phoneNumber, emSalary, officeNum, facultyRank);
				} else if (i == 6) {
					yourStaff = new Staff(name, address, phoneNumber, emSalary, Title);
				}
				System.out.println("");

			}

			System.out.println("");

			// print the info
			System.out.print(yourPerson);
			System.out.println("");

			System.out.print(yourStudent);
			System.out.println("");

			System.out.print(yourEmployee);
			System.out.println("");

			System.out.print(yourVisitor);
			System.out.println("");

			System.out.print(yourFaculty);
			System.out.println("");

			System.out.print(yourStaff);
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

}