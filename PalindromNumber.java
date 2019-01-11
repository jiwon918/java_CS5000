// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 2


import java.util.Scanner;
public class PalindromNumber {
   public static void main(String args[]){
   
   
      int input;
      int number;
      int reverse = 0;
   
   
      Scanner scan = new Scanner(System.in);
      System.out.print("Input value is:\t");
      input = scan.nextInt();
      int output = input;
   
   //Reversing the input number
      number = input % 10;
      reverse = reverse * 10 + number;
      input = input / 10;
   
      number = input % 10;
      reverse = reverse * 10 + number;
      input = input / 10;
   
      number = input % 10;
      reverse = reverse * 10 + number;
      input = input / 10;
   
      number = input % 10;
      reverse = reverse * 10 + number;
      input = input / 10;   
   
      number = input % 10;
      reverse = reverse * 10 + number;
      input = input / 10;
   
   //Checking to see if the output is equal to the reverse and making sure it has 5 digits
      if (output == reverse && output < 100000 && output > 9999) 
      {
         System.out.println("Judgment:\t\t\tPalindrome");
      }
      
      else if (output != reverse && output < 100000 && output > 9999) 
      {
         System.out.println("Judgment:\t\t\tNot Palindrome");
      }
      
      else 
      {
         System.out.println("Judgment:\t\t\tInvalid input, must be 5 digits number.");
      }
   
   
   
   }

}

