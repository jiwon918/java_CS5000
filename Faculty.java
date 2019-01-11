// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 10
// IDE:  jGrasp
 
import java.text.NumberFormat;

public class Faculty extends Employee {

	private String officeNum = "";
	private String facultyRank = "";

	// constructor.
	Faculty() {
		super();
		this.officeNum = "000";
		this.facultyRank = "Unknown";
	}

	Faculty(String name, String address, String phoneNumber, double emSalary, String officeNum, String facultyRank) {
		super(name, address, phoneNumber, emSalary);
		this.officeNum = officeNum;
		this.facultyRank = facultyRank;
	}

	public String toString() {
		NumberFormat formatterCurrency = NumberFormat.getCurrencyInstance();
		return "\nFaculty Object:\n\tName:\t\t\t" + name + "\n\tAddress:\t\t" + address + "\n\tPhone#:\t\t" + phoneNumber
				+ "\n\tSalary:\t\t" + formatterCurrency.format(emSalary) + "\n\tDate Hired:\t" + dateHired
				+ "\n\tOffice#:\t\t" + officeNum + "\n\tRank:\t\t\t" + facultyRank;
	}

}