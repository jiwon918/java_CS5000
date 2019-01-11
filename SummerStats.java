// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 9
// IDE:  jGrasp


import java.util.*;
import java.text.NumberFormat;

public class SummerStats
{ 


   private int[][] salary = new int[3][4];
   private int numEmployee = 0;
   private int numOfyears = 0;

   SummerStats(int numberE, int numberY) 
   {
      salary = new int[numberE][numberY];
      numEmployee = numberE;
      numOfyears = numberY;
      for (int i = 0; i < numEmployee; i++) 
      {
         for (int j = 0; j < numOfyears; j++) 
         {
            salary[i][j] = (int) (Math.random() * 48000 + 2000);
         }
      }
   }

   public int getnumEmployee()
   {
      return numEmployee; 
   } 
   
   public int getnumOfyears()
   {
      return numOfyears;
   }


   // #1
   public int mostMoney()
   {
      int[] highest = new int[numEmployee];
      int total = 0;
      int i;
      int bestIndex = 0;
   
      for (i = 0; i < numEmployee; i++)
      {   
         total = 0;
         for(int j = 0; j < numOfyears; j++)
         {
            total = total + salary[i][j];
         }
         highest[i] = total;
      }
   
      for(i = 1; i < numEmployee; i++)
      {
        if (highest[bestIndex] < highest[i])
           bestIndex = i;
      }
      return bestIndex;
  } 
  
  
  
   //#2
   public int highestSalaryYear()
   {
      int [] highestSalary = new int[numEmployee];
      int i;
      int max = 0;
      int maxYear = 0;
   
      for (i = 0; i < numEmployee; i++)
      {
         for(int j = 0; j < numOfyears; j++)
         {
            if(salary[i][j] > max)
            {
               max = salary[i][j]; 
               maxYear = j;
            }   
         }
       }    
      return maxYear;      
   }
    
  
  
  
  // #3
     public int totalEarnings(int numEmployee)
   {
      int total = 0;
      int i;
      total = 0;
         for(int j = 0; j < numOfyears; j++)
         {
            total = total + salary[numEmployee - 1][j];
         }
          
      return total;      
   }
   
   
   // #4
      public int allEarnings()
   {
      int totalAll = 0;
      int i;
   
      for (i = 0; i < numEmployee; i++)
      {
         for(int j = 0; j < numOfyears; j++)
         {
            totalAll = totalAll + salary[i][j];
         }
      }    
      return totalAll;      
   }
   
  
  
  // #5
     public int highestSalaryPerson(int numOfyears)
   {
      int max = 0;
      int maxIndex = 0;
      int i;
         for(i = 0; i < numEmployee; i++)
         {
            if(salary[i][numOfyears - 1] > max)
            {
               max = salary[i][numOfyears - 1]; 
               maxIndex = i;
            }   
         }  
      return maxIndex;      
   }
    


   // #6
      public double[] averageSalaryEachYear()
   {
      double []averageSalary = new double[numOfyears];
      double total = 0.0;
      double average = 0.0;
      int i;
   
      for (i = 0; i < numOfyears; i++)
      {
         total = 0.0;
         for (int j = 0; j < numEmployee; j++)
         {
         total = total + salary[j][i];
         }
         average = total/ numEmployee;
         averageSalary[i] = average;
      }    
      return averageSalary;      
   }
   

   // #7
     public void printSalaries() 
   {
      NumberFormat formatter = NumberFormat.getCurrencyInstance();
      formatter.setMaximumFractionDigits(0);
      System.out.print("\t\t\t\t\t");
      for(int i = 0; i < numOfyears; i++)
      {
      System.out.print("\t\t\tYear" + (i + 1));
      }
      System.out.println("");
   
      System.out.print("\t\t\t\t\t\t\t\t");
      for(int i = 0; i < numOfyears; i++)
      {
      System.out.print("------------");
      }   
      System.out.println("");
      
      for (int i = 0; i < numEmployee; i++) 
      {
         System.out.print("\t\t\tEmployee " + (i + 1) + "\t\t");
         for (int j = 0; j < numOfyears; j++) 
         {
           System.out.print(formatter.format(salary[i][j]) + "\t\t");
         }
         System.out.println();
      }
      System.out.println();
   }

  

// user input method

   public void salaryInput()
   {
      Scanner scan = new Scanner(System.in);
      int mySalary = 0;
     
      for(int i = 0; i < numEmployee; i++)
      {
         for(int j = 0; j < numOfyears; j++)
         {
            System.out.print("Enter your rate for Employee " + i + " in year " + (j + 1) + " (enter between $2,000 and $50,000):\t");
            mySalary = scan.nextInt();
            scan.nextLine();
         
            if(mySalary < 2000 || mySalary > 50000)
            {   
               System.out.println("Invalid input. Please try again.");
               j--;
               continue;
            }   
         
            salary[i][j] = mySalary;
         }
      }
  }
  }
