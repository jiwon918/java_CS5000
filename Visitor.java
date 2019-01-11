// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 10
// IDE:  jGrasp 

import java.util.Date;

public class Visitor extends Person {

	private String visitPurpose;
	private Date visitDate;

	public Visitor() {
		visitPurpose = "";
		visitDate = new Date();
	}

	public Visitor(String name, String address, String phoneNumber, String visitPurpose) {
		super(name, address, phoneNumber);
		this.visitPurpose = visitPurpose;
		visitDate = new Date();
	}

	public String toString() {
		return "\nVisitor Object:\n\tName:\t\t\t" + name + "\n\tAddress:\t\t" + address + "\n\tPhone#:\t\t" + phoneNumber
				+ "\n\tVisit:\t\t" + visitPurpose + "\n\tVisit Date:\t" + visitDate;
	}

}