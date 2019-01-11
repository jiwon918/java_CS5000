// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 4
// IDE:  jGrasp

import java.util.Scanner;
public class PasswordTest
{
   public static void main(String[] args)
   {
      String password;
      Scanner scan = new Scanner(System.in);
      
      while (true)
      {
         System.out.println("\t");
         System.out.println("Enter your password here (Password must have at least 8 characters):\t");
         password = scan.nextLine();
         char digit;
         int checkNumber = 0;
         int checkUpper = 0;
         int checkLower = 0;
         int checkSpecial = 0;
         
         System.out.println("\t");
         System.out.println("Entered Password:\t" + password);
      
       
         if (password.length() < 8)
            System.out.println("Verdict:\t\t\t\tInValid Password");
         
         else
         {
            for (int i = 0; i < password.length(); i++)  
            {
               digit = password.charAt(i);
            
               if (digit >= '0' && digit <= '9')   //to check for digit
                  checkNumber = 1;
               else if (digit >= 'A' && digit <= 'Z') //to check for upper-case letter
                  checkUpper = 1;
               else if (digit >= 'a' && digit <= 'z') //to check for lower-case letter
                  checkLower = 1;
               else
                  checkSpecial = 1;
            }
         
            if (checkNumber == 1 && checkUpper == 1 && checkLower == 1 && checkSpecial == 1)
               System.out.println("Verdict:\t\t\t\tValid Password");
            else
               System.out.println("Verdict:\t\t\t\tInValid Password");
         }
      }
   }
}