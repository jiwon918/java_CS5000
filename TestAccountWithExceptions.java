
	// Class: CS 5000/01
	// Term:  Fall 2018
	// Name:  Jiwon Her
	// Instructor: Dr. Haddad
	// Assignment: 8
	// IDE:  jGrasp

	import java.util.*;

	public class TestAccountWithExceptions {
		public static void main(String[] args) {
			// declare variables
			Scanner scan = new Scanner(System.in);
			String another = "Y";
			int accountId = 0;
			double balance = 0.0;
			double interestRate = 0.0;
			int menuSelector = 0;
			double amount = 0.0;
			int accountSelector = 0;

			// sentinel loop
			while (another.equalsIgnoreCase("Y")) {

				// getting account ID
				System.out.print("Input myObject Account ID (Integer only): ");
				accountId = scan.nextInt();
				// getting the initial balance

				System.out.print("Input myObject Initial Balance (Number only): ");
				// try catch the zero or negative number
				while (true) {

					try {
						balance = scan.nextDouble();
						if (balance <= 0) {
							throw new IllegalArgumentException();
						}
						break;
					} catch (IllegalArgumentException e) {
						System.out.println();
						System.out.println("Invalid Input: Initial balance must be positive.");
						System.out.println();
						System.out.print("Input myObject Initial Balance (Number only): ");

					}
					scan.nextLine();

				}
				// getting the interest rate

				System.out.print("Input myObject Interest Rate (Number only): ");

				while (true) {

					try {
						interestRate = scan.nextDouble();
						if (interestRate <= 0) {
							throw new IllegalArgumentException();
						}
						break;
					} catch (IllegalArgumentException e) {
						System.out.println();
						System.out.println("Invalid Input: interestRate must be positive.");
						System.out.println();
						System.out.print("Input myObject interestRate (Number only): ");

					}
					scan.nextLine();

				}

				System.out.println();

				Account myObject = new Account(accountId, balance);
				myObject.setannualInterestRate(interestRate);
				System.out.println(myObject);
				System.out.println();

				// getting inputs
				System.out.print("Input myAccount Account ID (Integer only): ");
				accountId = scan.nextInt();
				System.out.print("Input myAccount Initial Balance (Number only): ");

				while (true) {

					try {
						balance = scan.nextDouble();
						if (balance <= 0) {
							throw new IllegalArgumentException();
						}
						break;
					} catch (IllegalArgumentException e) {
						System.out.println();
						System.out.println("Invalid Input: Initial balance must be positive.");
						System.out.println();
						System.out.print("Input myAccount Initial Balance (Number only): ");

					}
					scan.nextLine();

				}

				System.out.print("Input myAccount Interest Rate (Number only): ");
				while (true) {

					try {
						interestRate = scan.nextDouble();
						if (interestRate <= 0) {
							throw new IllegalArgumentException();
						}
						break;
					} catch (IllegalArgumentException e) {
						System.out.println();
						System.out.println("Invalid Input: interestRate must be positive.");
						System.out.println();
						System.out.print("Input myAccount interestRate (Number only): ");

					}
					scan.nextLine();

				}

				System.out.println();

				Account myAccount = new Account(accountId, balance);
				myAccount.setannualInterestRate(interestRate);
				System.out.println(myAccount);
				System.out.println();

				// getting inputs

				System.out.print("Input yourAccount Account ID (Integer only): ");
				accountId = scan.nextInt();

				System.out.print("Input yourAccount Initial Balance (Number only): ");

				while (true) {
					try {
						balance = scan.nextDouble();
						if (balance <= 0) {
							throw new IllegalArgumentException();
						}
						break;
					} catch (IllegalArgumentException e) {
						System.out.println();
						System.out.println("Invalid Input: Initial balance must be positive.");
						System.out.println();
						System.out.print("Input yourAccount Initial Balance (Number only): ");

					}
					scan.nextLine();
				}

				System.out.println();
				System.out.print("Input yourAccount Interest Rate (Number only): ");
				while (true) {

					try {
						interestRate = scan.nextDouble();
						if (interestRate <= 0) {
							throw new IllegalArgumentException();
						}
						break;
					} catch (IllegalArgumentException e) {
						System.out.println();
						System.out.println("Invalid Input: interestRate must be positive.");
						System.out.println();
						System.out.print("Input yourAccount interestRate (Number only): ");
					}
					scan.nextLine();
				}

				System.out.println();

				Account yourAccount = new Account(accountId, balance);
				yourAccount.setannualInterestRate(interestRate);
				System.out.println(yourAccount);
				System.out.println();

				// assign each account into array
				Account[] accountList = new Account[4];
				accountList[1] = myObject;
				accountList[2] = myAccount;
				accountList[3] = yourAccount;

				while (true) {
					// to give the user an option to choose account

					System.out.println("Select Account");
					System.out.print("1. myObject, 2. myAccount, 3. yourAccount, 4. EXIT (Input 1-4): ");
					accountSelector = scan.nextInt();
					scan.nextLine();
					System.out.println();

					if (accountSelector < 1 || accountSelector > 4)
						continue;
					if (accountSelector == 4) {
						System.out.println("Exit.\n");
						break;
					}

					while (true) {
						System.out.println("Select Menu");
						System.out.print("1. Withdraw, 2. Deposit, 3. Check Current Status, 4. Exit (Input 1-4): ");
						menuSelector = scan.nextInt();
						System.out.println();
						if (menuSelector == 1) {
							System.out.print("Input the amount of withdraw: ");
							while (true) {

								try {
									amount = scan.nextDouble();
									if (amount <= 0) {
										throw new IllegalArgumentException();
									}
									break;
								} catch (IllegalArgumentException e) {
									System.out.println();
									System.out.println("Invalid Input: withdraw amount must be positive.");
									System.out.println();
									System.out.print("Input the amount of withdraw: ");

								}
								scan.nextLine();

							}

							accountList[accountSelector].withdraw(amount);
							System.out.println();
							System.out.println(accountList[accountSelector]);
							System.out.println();

						} else if (menuSelector == 2) {
							System.out.print("Input the amount of deposit: ");
							while (true) {

								try {
									amount = scan.nextDouble();
									if (amount <= 0) {
										throw new IllegalArgumentException();
									}
									break;
								} catch (IllegalArgumentException e) {
									System.out.println();
									System.out.println("Invalid Input: deposit amount must be positive.");
									System.out.println();
									System.out.print("Input the amount of deposit: ");

								}
								scan.nextLine();

							}

							accountList[accountSelector].deposit(amount);
							System.out.println();
							System.out.println(accountList[accountSelector]);
							System.out.println();

						} else if (menuSelector == 3) {
							System.out.println();
							System.out.println(accountList[accountSelector]);
							System.out.println();
						} else if (menuSelector == 4) {
							System.out.println("Log out from current account.");
							System.out.println();
							break;
						}

					}

					System.out.print("Try again (Y/N) ?\t");
					another = scan.next();
					System.out.println("");
				}
				System.out.println("Program terminated");

			}
		}
	}
