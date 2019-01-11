// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 5
// IDE:  jGrasp

import java.util.Scanner;
public class KeyPad
{
   public static void main(String[] args)
   {
      char uppercaseLetter;
      int urNumber;
      String phoneNumber = "";
      String input; 
      
      Scanner scan = new Scanner (System.in);
   
      while (true)
      {
         System.out.println("\t");
         System.out.print("Enter phone number:\t");
         input = scan.nextLine();
         System.out.println("You entered:\t" + input);
         input = input.toUpperCase();
         phoneNumber = ""; 
      
         for(int i = 0; i < input.length(); i++)
         {  
            uppercaseLetter = input.charAt(i);
            if(uppercaseLetter >= 'A' && uppercaseLetter <= 'Z')
            {
               urNumber = getNumber(uppercaseLetter);     //calling getNumber method
               phoneNumber = phoneNumber.concat(String.valueOf(urNumber - 48));
            }
            else
               phoneNumber = phoneNumber.concat(String.valueOf(uppercaseLetter));
         }
         System.out.println("Phone Number:\t" + phoneNumber);
      }
   
   }
   
   public static int getNumber (char uppercaseLetter)
   { 
      if (uppercaseLetter >= 'A' && uppercaseLetter <= 'C')
         return '2';
      else if (uppercaseLetter >= 'D' && uppercaseLetter <= 'F')
         return '3';
      else if (uppercaseLetter >= 'G' && uppercaseLetter <= 'I')
         return '4';
      else if (uppercaseLetter >= 'J' && uppercaseLetter <= 'L')
         return '5';
      else if (uppercaseLetter >= 'M' && uppercaseLetter <= 'O')
         return '6';
      else if (uppercaseLetter >= 'P' && uppercaseLetter <= 'S')
         return '7';
      else if (uppercaseLetter >= 'T' && uppercaseLetter <= 'V')
         return '8';
      else if (uppercaseLetter >= 'W' && uppercaseLetter <= 'Z')
         return '9';
      
      return 0;
   } 

}