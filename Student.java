// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 10
// IDE:  jGrasp 

public class Student extends Person {

	private String stuClass;

	public Student() {
		stuClass = "";
	}

	public Student(String name, String address, String phoneNumber, String stuClass) {
		super(name, address, phoneNumber);
		this.stuClass = stuClass;

	}

	public String toString() {
		return "\nStudent Object:\n\tName:\t\t\t" + name + "\n\tAddress:\t\t" + address + "\n\tPhone#:\t\t" + phoneNumber
				+ "\n\tStatus:\t\t" + stuClass;
	}

}
