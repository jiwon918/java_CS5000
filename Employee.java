// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 10
// IDE:  jGrasp 

import java.text.NumberFormat;
import java.util.Date;

public class Employee extends Person {

	protected double emSalary;
	protected Date dateHired;

	Employee() {
		this.emSalary = 0.0;
		this.dateHired = new Date();
	}

	Employee(String name, String address, String phoneNumber, double emSalary) {
		super(name, address, phoneNumber);
		this.emSalary = emSalary;
		this.dateHired = new Date();
	}

	public String toString() {
		NumberFormat formatterCurrency = NumberFormat.getCurrencyInstance();
		return "\nEmployee Object:\n\tName:\t\t\t" + name + "\n\tAddress:\t\t" + address + "\n\tPhone#:\t\t" + phoneNumber
				+ "\n\tSalary:\t\t" + formatterCurrency.format(emSalary) + "\n\tDate Hired:\t" + dateHired;
	}

}