// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 4
// IDE:  jGrasp

import java.util.Scanner;

public class InputSum
{
   public static void main(String[] args) 
   {  
      int value = 0;
      int sum = 0;
      int msgflag = 0;
      
      String str = "Entered Numbers:\t";
      Scanner scan = new Scanner(System.in);
      
      while (true)
      {
         sum = 0;  
         System.out.print("Enter positive integers (-1 to quit):\t");     
      
         while ((value = scan.nextInt()) != -1)
         {   
            if(value > 0)
            {
               sum += value;
               if(msgflag == 0) //first positive number
               {
                  str = str.concat(String.valueOf(value));
                  msgflag = 1;
               }
               else 
                  str = str.concat(", "+ String.valueOf(value));
            } 
         }   
         System.out.println(str);
         System.out.println("The Sum:\t\t\t\t" + sum);
      }
   
   }
}