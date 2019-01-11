// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 1

import java.util.Scanner;
public class SumDigits{
   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);   
      System.out.print(" Enter a number between 0 and 9999:\t"); //to indicate the user to choose a number between 0 and 9999
      int num = input.nextInt();
   
   //steps to get the numbers of each digits
      int ones = num % 10;
   
      int tens = (num / 10) % 10 ;
   
      int houndreds = (num / 100) % 10;
      
      int thousands = (num / 1000) % 10;
   
   //sum of the digits in a number
      int answer = ones + tens + houndreds + thousands;
   
      System.out.print(" The sum of the digit is:\t\t\t\t" + answer);
   }
}