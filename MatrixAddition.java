// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 7
// IDE:  jGrasp

import java.util.*;
public class MatrixAddition
{
   public static void main(String[] args)
   {
      int i = 0;
      int j = 0;
      int[][] matrixA = new int[3][3];
      int[][] matrixB = new int[3][3];
      
      Scanner scan = new Scanner(System.in);
      String another = "Y";   
         
      while (another.equalsIgnoreCase("Y")) 
      {
         System.out.println("Enter 9 values for Matrix A:");
      
         Scanner input = new Scanner(System.in);
         
         for (i = 0; i < matrixA.length; i++)
         { 
            for (j = 0; j < matrixA[i].length; j++)
            {
               matrixA[i][j] = input.nextInt();
            }
         }
         System.out.println();
         input.nextLine();
                  
         System.out.println("Enter 9 values for Matrix B:");
         for (i = 0; i < matrixB.length; i++)
         { 
            for (j = 0; j < matrixB[i].length; j++)
            {
               matrixB[i][j] = input.nextInt();
            }
         }
         System.out.println();
         input.nextLine();
         
          
         System.out.println("Matrix A:");
         for (i = 0; i < matrixA.length; i++)
         {
            for (j = 0; j < matrixA[i].length; j++)
            {
               System.out.print("\t\t" + matrixA[i][j]);
            }
            System.out.println();
         }
        
         System.out.println();
         
         System.out.println("Matrix B:");
         for (i = 0; i < matrixB.length; i++)
         {
            for (j = 0; j < matrixB[i].length; j++)
            {
               System.out.print("\t\t" + matrixB[i][j]);
            }
            System.out.println();
         }
      
         System.out.println();
      
         add(matrixA, matrixB);
      
         System.out.println();
         System.out.print("Try again (Y/N) ?\t");
         another = scan.next();
         System.out.println("");
      }
      System.out.println("Program terminated");
      
   }  

   
   public static void add(int[][] matrixA, int[][] matrixB)
   {
      int i;
      int j;
   
      System.out.println("Matrix A+B:");
   
      
      for (i = 0; i < 3; i++)
      {
         for (j = 0; j < 3; j++)
         {
            System.out.print("\t\t" + (matrixA[i][j] + matrixB[i][j]));
         }
         System.out.println();
      }
   
   }  
}