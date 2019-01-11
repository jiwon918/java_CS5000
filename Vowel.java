// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 3


import java.util.Scanner;
public class Vowel{
   public static void main(String[] args){
   
   
      Scanner scan = new Scanner(System.in);
      System.out.print("Please enter a letter:\t");
      char ch = scan.next().charAt(0);
      
      if(ch == 'A' || ch == 'a' || ch == 'E'|| ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u')      // vowel
      {
         System.out.println("You entered " + ch);
         System.out.println(ch + " is a vowel");
      }
      else if((ch >='a' && ch <= 'z')||(ch >= 'A' && ch <= 'Z'))     // consonant
      {
         System.out.println("You entered " + ch);
         System.out.println(ch + " is a consonant");
      } else
      {
         System.out.println("You entered " + ch);
         System.out.println(ch + " is invalid input");      // neither vowel nor consonant 
      }
   
   }
}