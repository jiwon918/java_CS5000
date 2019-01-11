// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 12
// IDE:  jGrasp
import java.util.*;

public class Vowels {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String another = "Y";

		// sentinel loop
		while (another.equalsIgnoreCase("Y")) {

			System.out.print("Enter a word:\t\t");
			String str = scan.nextLine();

			System.out.println("Number of vowels:\t" + countVowels(str));
			System.out.println("");
			System.out.print("Try again (Y/N) ?\t");
			another = scan.next();
			scan.nextLine();
			System.out.println("");
		}
		System.out.println("Program terminated");
		scan.close();
	}

	public static int countVowels(String str) {
		if (str == null)
			return 0;
		if (str.length() == 0) {
			return 0;
		}
		if (str.length() > 1) {
			return countVowels(str.substring(0, str.length() / 2)) + countVowels(str.substring(str.length() / 2));
		} 
		// str.length() == 1
		str = str.toLowerCase();
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		for (int i = 0; i < vowels.length; i++) {
			if (str.charAt(0) == vowels[i]) {
				return 1;
			}
		}
		return 0;
	}

}





/*
//without using recursive 
import java.util.*;
public class Vowels {

	public static void main(String[] args) {
		String Sentence = "";
		Scanner scan = new Scanner (System.in);
		System.out.print("Entered String:\t");
		Sentence = scan.nextLine();
		
		int numbVowels = 0;
		numbVowels = countVowels(Sentence);
		
		System.out.print("Number of vowels:\t" + numbVowels);
		
		
	}
	
	public static int countVowels(String Sentence) {
		int sum = 0;
		for(int i = 0; i < Sentence.length(); i++) {
			if(Sentence.charAt(i) == 'a' || Sentence.charAt(i) == 'e' || Sentence.charAt(i) == 'i' || Sentence.charAt(i) == 'o' || Sentence.charAt(i) == 'u')
				sum++;
			}
		return sum;
	}
}
*/