// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 10
// IDE:  jGrasp 

import java.text.NumberFormat;

public class Staff extends Employee {

	private String Title;

	public Staff() {
		Title = "";
	}

	public Staff(String name, String address, String phoneNumber, Double emSalary, String Title) {
		super(name, address, phoneNumber, emSalary);
		this.Title = Title;
	}

	public String toString() {
		NumberFormat formatterCurrency = NumberFormat.getCurrencyInstance();
		return "\nStaff Object\n\tName:\t\t\t" + name + "\n\tAddress:\t\t" + address + "\n\tPhone#:\t\t" + phoneNumber
				+ "\n\tSalary:\t\t" + formatterCurrency.format(emSalary) + "\n\tDate Hired:\t" + dateHired
				+ "\n\tTitle:\t\t" + Title;
	}

}