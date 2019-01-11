// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 6
// IDE:  jGrasp

import java.util.Scanner;
public class TestIndexOfLargest
{
   public static void main(String[] args)
   {
      int[] Numbs = new int [10];  
      int i = 0;
      int index;
      Scanner scan = new Scanner(System.in);
   
      String another = "Y";   
         
      while (another.equalsIgnoreCase("Y"))
      {
         System.out.print("Entered integer values:\t");
         int value = scan.nextInt();
      
         i = 0;
      
         while (i < 10)
         { 
            Numbs[i] = value;
            i++;
         
            if(i == 10)
               break;
            value = scan.nextInt();
         }
      
         index = IndexOfLargest.findIndex(Numbs);
         System.out.println("Index of largest value:\t" + index); 
         System.out.println("");
         scan.nextLine();
         System.out.print("Try again (Y/N) ?\t");
         another = scan.next();
         System.out.println("");
         }
      System.out.println("Program terminated");
      
   }
}


