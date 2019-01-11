// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 3

import java.util.Scanner;

public class StringMethods
{
   public static void main(String[] args)
   {
   
      String string_1;
      String string_2;
      String mutation1, mutation2, mutation3, mutation4;
      int length1;
      int length2;
   
   
   // Getting user input for String 1 and String 2:
      Scanner input = new Scanner(System.in);   
      System.out.print("Enter the first string:\t\t\t");
      string_1 = input.nextLine();
      System.out.print("Enter the second string:\t\t");
      string_2 = input.nextLine();
      
      
   //
      System.out.println("");     // leaving a line blank to make it easier to see the output section
      
            
   // Part A: Legnth of String 1:
      length1 = string_1.length();
      System.out.println("a) Length of String 1:\t\t" + length1 + " characters");
   
   // Part B: Legnth of String 2:
   
      length2 = string_2.length();
      System.out.println("b) Length of String 2:\t\t" + length2 + " characters");
   
   // Part C: Concatenation:
      mutation1 = string_1.concat(" " + string_2);
      System.out.println("c) Concatenation:\t\t\t\t" + mutation1);
   
   
   // Part D: Compare and check if the two strings have same set of characters with regard to case:
      int compare = string_1.compareTo(string_2);
      
      if (compare == 0)  
         System.out.println("d) Equal Strings?\t\t\t\tEqual");
      else
         System.out.println("d) Equal Strings?\t\t\t\tNot equal");
         
   
   // Part E: Convert string_1 to upper case:
      mutation2 = string_1.toUpperCase();
      System.out.println("e) Uppercase String 1:\t\t" + mutation2);
   
   // Part F: Convert string_2 to lower case:
      mutation3 = string_2.toLowerCase();
      System.out.println("f) Lowercase String 2:\t\t" + mutation3);
   
   // Part G: Extract a valid sub-string of multiple characters from string_1:
      String subString = string_1.substring(0, length1/2);
      System.out.println("g) Valid substring:\t\t\t" + subString);    //extracting a sub-string from index 0 to (length1/2)
   
   
   
   }
}
