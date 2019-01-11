// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 5
// IDE:  jGrasp

import java.util.Scanner;
public class Password
{
   public static void main(String[] args)
   {
      String password;
      Scanner scan = new Scanner(System.in);
      boolean checkit = true;
   
      while (true)                        //allows the user to re-run the program
      {     
         System.out.println("\t");
         System.out.println("Enter your password here (Password must have at least 8 characters):\t");
         password = scan.nextLine();
         checkit = CheckPassword(password);
      
         System.out.println("Entered Password:\t" + password);
      
         if(checkit == true)
            System.out.println("Verdict:\t\t\t\tValid Password");
         else 
            System.out.println("Verdict:\t\t\t\tInvalid Password");
      }
   }
   
  
   
   public static boolean CheckPassword(String password)
   {
      boolean checker1 = charNumber(password);     //calling value got from charNumber method
      boolean checker2 = containsLD(password);     //calling value got from containsLD method
      boolean checker3 = digitNumber(password);    //calling value got from digitNumber method
   
      if (checker1 == true && checker2 == true && checker3 == true) 
         return true;
      else
         return false;
   }
   
   
   public static boolean charNumber(String password)
   {       
      if (password.length() < 10)
         return false;      
      else 
         return true;
   } 
   
   
   public static boolean containsLD(String password)
   {
      char digit;
      boolean checkNumber = false;
      boolean checkUpper = false;
      boolean checkLower = false;
        
      for (int i = 0; i < password.length(); i++)  
      {
         digit = password.charAt(i);
         {
            if (digit >= '0' && digit <= '9')   //to check for digit
               checkNumber = true;
            else if (digit >= 'A' && digit <= 'Z') //to check for upper-case letter
               checkUpper = true;
            else if (digit >= 'a' && digit <= 'z') //to check for lower-case letter
               checkLower = true;
         }
      }
      if (checkNumber == true && checkUpper == true && checkLower == true)    
         return true;
      else
         return false;
   }
 
   
   
   public static boolean digitNumber(String password)
   {  int digit;
      int count = 0;
      for(int i = 0; i < password.length(); i++)
      {
         digit = password.charAt(i);
         if (digit >= '0' && digit <= '9')   //to check for digit
            count = count + 1;            
      }      
      if (count >= 3) 
         return true;
      else
         return false;
   }
    
}   
   
