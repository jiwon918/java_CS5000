// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 10
// IDE:  jGrasp 

public class Person {

	protected String name;
	protected String address;
	protected String phoneNumber;

	public Person() {
		this.name = "";
		this.address = "";
		this.phoneNumber = "";
	}

	public Person(String name, String address, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public String toString() {
		return "\nPerson Object:\n\tName:\t\t\t" + name + "\n\tAddress:\t\t" + address + "\n\tPhone#:\t\t" + phoneNumber;
	}

}