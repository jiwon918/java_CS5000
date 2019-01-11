// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 9
// IDE:  jGrasp

import java.text.NumberFormat;
import java.util.Scanner;

public class testSummerStats 
{
   public static void main(String[] args) 
   {
      Scanner scan = new Scanner(System.in);
      String another = "Y";
      NumberFormat formatter = NumberFormat.getCurrencyInstance();
      
      int numberE;
      int numberY;
      
      while (another.equalsIgnoreCase("Y")) 
      {
         formatter.setMaximumFractionDigits(0);
         while(true)      //get the number of hotels with error check (input validation)
         {
         System.out.print("Enter number of employees (only positive integer please): ");
         numberE = scan.nextInt();
         scan.nextLine();
         
         if(numberE > 0)
            break; 
         }
         
         while(true)     //get the number of years with error check (input validation)
         {
         System.out.print("Enter number of years (only positive integer please): ");
         numberY = scan.nextInt();
         scan.nextLine();
         if(numberY > 0)
            break; 
         }
         
         SummerStats testEmployee = new SummerStats(numberE, numberY);
         System.out.print("Enter 1 to use user rating, enter 2 to use random rating: ");
         int value = scan.nextInt();
         scan.nextLine();
         
         if(value == 1)
         {
            // User input  
            System.out.println("Let's use your rating!");
            testEmployee.salaryInput();
         }
         else if (value != 2)
         {
            System.out.println("Wrong input. Try again!");
            continue;   
         }

         System.out.println();
         // #7 print the Employee Data
         System.out.println("Employee Data: ");
         testEmployee.printSalaries();
         System.out.println();
    
         // #1 most money 
         int bestIndex = testEmployee.mostMoney();
         System.out.print("Employee" + (bestIndex + 1) + " made the most money over the years.");
         System.out.println();
         
       
         // #2 highestSalaryYear 
         int maxYear = testEmployee.highestSalaryYear();
         System.out.println("Highest salary was made in Year" + (maxYear + 1) + ".");
     
     
         // #3 totalEarnings 
         int whoTotal = 0;
         while(true)      
         {
         System.out.print("Enter employee number to check total earning (1 to " + testEmployee.getnumEmployee() + "): ");
         whoTotal = scan.nextInt();
         scan.nextLine();
         
         if(whoTotal > 0 && whoTotal <= testEmployee.getnumEmployee())
            break; 
         }
         
         int totalEarn = testEmployee.totalEarnings(whoTotal);
         System.out.println("Total earning by Employee" + whoTotal + " is " + formatter.format(totalEarn));

         
         // #4 allEarnings 
         
         int totalAll = testEmployee.allEarnings();
         System.out.println("Total earning by all Employees is " + formatter.format(totalAll));
         
         
         // #5 highestSalaryPerson
         int chosenYear = 0;
         while(true)      
         {
         System.out.print("Enter year to check total the highest earned employee (1 to " + testEmployee.getnumOfyears() + "): ");
         chosenYear = scan.nextInt();
         scan.nextLine();
         
         if(chosenYear > 0 && chosenYear <= testEmployee.getnumOfyears())
            break; 
         }
         
         int highEmployee = testEmployee.highestSalaryPerson(chosenYear);
         System.out.println("In year" + chosenYear + ", Employee" + (highEmployee + 1) + " has the highest salary.");
        
         // #6 averageSalaryEachYear 
         formatter.setMinimumFractionDigits(2);      
         double[] avgSalary = testEmployee.averageSalaryEachYear();
         System.out.println("The average salary for year:");
         System.out.println();
         
         for(int i = 0; i < testEmployee.getnumOfyears(); i++)
         {
            System.out.print("\t\t\tYear" + (i + 1) + "\t");
         }
         System.out.println("");
      
         System.out.print("\t\t\t------------");
         for(int i = 0; i < testEmployee.getnumOfyears(); i++)
         {
            System.out.print("-------------");
         }   
         System.out.println("");
            System.out.print("\t\t\t");
         for (int i = 0; i < testEmployee.getnumOfyears(); i++) 
         {
            System.out.print(formatter.format(avgSalary[i]) + "\t\t");
         }
         System.out.println("");
         
     
         System.out.println();
         System.out.print("Try again (Y/N) ?\t");
         another = scan.next();
         scan.nextLine();
         System.out.println("");
      }
      System.out.println("Program terminated");
       
      
   }
}