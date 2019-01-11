// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 7
// IDE:  jGrasp


import java.util.*;
public class MinMaxAvg
{
   public static void main(String[] args)
   {
      int[][] Grades = new int[4][4];
      Scanner scan = new Scanner(System.in);
      String another = "Y";   
         
      while (another.equalsIgnoreCase("Y")) 
      {
         System.out.println("Grades:");
         int max = 0;
         int min = 100;
         int total = 0;
      
         for (int i = 0; i < Grades.length; i++)
         { 
            for (int j = 0; j < Grades[i].length; j++)
            {
               Grades[i][j] = (int)(Math.random() * 100);
               System.out.print("\t\t" + Grades[i][j]);
               
               if(Grades[i][j] > max)
                  max = Grades[i][j];
               
               if(Grades[i][j] < min)
                  min = Grades[i][j];
               total = total + Grades[i][j]; 
            }
            System.out.println();
         }
         System.out.println();
      
         minMaxAvg(max, min, total);
      
         System.out.println();
         System.out.print("Try again (Y/N) ?\t");
         another = scan.next();
         System.out.println("");
      }
      System.out.println("Program terminated");
   }  
   
   public static void minMaxAvg(int max, int min, int total)
   {
   
      //float avg = (float)total/16.00;
      System.out.println("Highest grade:\t" + max);
      System.out.println("Lowest grade:\t" + min);
      System.out.printf("Class average:\t" + "%.2f",(float)total/16.00);
      System.out.println();
   }
   
   
}