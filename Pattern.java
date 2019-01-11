// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 4
// IDE:  jGrasp

import java.util.Scanner;
public class Pattern
{
   public static void main(String[] args)
   {
      for (int i = 1; i <= 6; i++)
      {
         for (int j = 0; j <= 2 * (i - 1); j++) 
            System.out.print(" ");
         
         for (int j = 1; j <= 7 - i; j++)
            System.out.print(j + " ");
            
         System.out.println();
      }
   }
}




