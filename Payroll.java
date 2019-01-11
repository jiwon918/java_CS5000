// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 3


import java.util.Scanner;
public class Payroll{
   public static void main(String[] args){
   
   
      Scanner scan = new Scanner(System.in);       
   
   // User input for Employee's Name 
      System.out.print("Enter employee's name:\t");
      String name  = scan.nextLine();
   
   // User input for Weekly hours worked 
      System.out.print("Enter weekly hours worked:\t");
      int hours = scan.nextInt();
   
   // User input for Hourly pay rate
      System.out.print("Enter hourly pay rate:\t");
      double payRate = scan.nextDouble();
   
   // User input for Federal tax rate
      System.out.print("Enter federal tax rate:\t");
      double fTax = scan.nextDouble();
   
   // User input for State tax rate
      System.out.print("Enter state tax rate:\t");
      double sTax = scan.nextDouble();
   
   
   // variables 
      double hoursW = hours;     // convert int to double  for grossPay calculation
      double grossPay = (hoursW * payRate);
      double federalW = (grossPay * 0.2);
      double stateW = (grossPay * 0.05);
      double netPay = (grossPay - (federalW + stateW));
      int netPAY = (int)netPay;        // convert double to int for Net Pay value
   
   
   // Output 
      System.out.println("   ");    // leaving a line blank to make it easier to see the output section
      System.out.println("Payroll statement");
      System.out.println("=================");
      System.out.println("Employee Name:\t\t\t" + name);
      System.out.println("Hours Worked:\t\t\t" + hours);
      System.out.println("Pay Rate (per Hour):\t$" + String.format("%.2f",payRate));      // 2 decimal place
      System.out.println("Gross Weekly Pay:\t\t$" + String.format("%.2f",grossPay));      // 2 decimal place
      System.out.println("Federal Withholding:\t$" + String.format("%.2f",federalW));     // 2 decimal place
      System.out.println("State Withholding:\t$" + String.format("%.2f",stateW));         // 2 decimal place
      System.out.println("Net Pay:\t\t\t\t\t$" + netPAY);
   
   
   
   }
}