// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 6
// IDE:  jGrasp

import java.util.Scanner;
public class TestDistinctValues
{
   public static void main(String[] args)
   {
      int[] oldArray = new int [10];  
      int i = 0;
      Scanner scan = new Scanner(System.in);
   
      String another = "Y";   
         
      while (another.equalsIgnoreCase("Y")) 
      {
         System.out.print("Entered 10 integers:\t\t\t");
         int value = scan.nextInt();
         i = 0;
      
         while (i < 10)
         { 
            oldArray[i] = value;
            i++;
         
            if(i == 10)
               break;
            value = scan.nextInt();
         }
         System.out.print("Array before processing:\t");
         for(i = 0; i < 10; i++)
            System.out.print(oldArray[i] + " "); 
         System.out.println("");

         int[] afterArray = DistinctValues.getValues(oldArray);
         System.out.print("Array after processing:\t\t");
         for(i = 0; i < afterArray.length; i++)
            System.out.print(afterArray[i] + " ");
         
         System.out.println("");
         System.out.println("");
         scan.nextLine();

         System.out.print("Try again (Y/N) ?\t");
         another = scan.next();
         System.out.println("");
      }
      System.out.println("Program terminated");
      
   }
}

