// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 7
// IDE:  jGrasp

import java.util.*;
public class WeeklyHours
{
   public static void main(String[] args)
   {
      int[][] dailyHours = new int[3][7];
      
      Scanner scan = new Scanner(System.in);
      String another = "Y";   
         
      while (another.equalsIgnoreCase("Y")) 
      {
         System.out.println("\t\t\t  Mon\t  Tue\t  Wed\t  Thu\t  Fri\t  Sat\t  Sun");
      
         for (int i = 0; i < dailyHours.length; i++)
         { 
            System.out.print("Employee" + (i + 1) + "\t"); 
            for (int j = 0; j < dailyHours[i].length; j++)
            {
               dailyHours[i][j] = (int)(Math.random() * 10);
               System.out.print(dailyHours[i][j] + "\t\t");
            }
            System.out.println();
         }
         System.out.println();
      
         addHours(dailyHours);
      
         System.out.println();
         System.out.print("Try again (Y/N) ?\t");
         another = scan.next();
         System.out.println("");
      }
      System.out.println("Program terminated");
      
   }  
 
   public static void addHours(int[][] dailyHours)
   {
      int[][] totalHours = new int[3][2];
      int total = 0;
      int i;
   
      for (i = 0; i < 3; i++)
      {
         total = 0;
         for(int j = 0; j < 7; j++)
         {
            total = total + dailyHours[i][j];
         }
         totalHours[i][0] = i + 1;
         totalHours[i][1] = total;
      }
   
   
      System.out.println("Employee#\t\t" + "Weekly Hours");
      System.out.println("----------------------------");
      for (i = 0; i < 3; i++)
      {
         System.out.print("\t" + totalHours[i][0]+ "\t\t\t\t\t" + totalHours[i][1]);
         System.out.println();
      }
   
   
   }
}
