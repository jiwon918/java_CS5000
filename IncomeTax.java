// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 2

import java.util.Scanner;
public class IncomeTax{
   public static void main(String[] args) {
   
   
      Scanner scan = new Scanner (System.in);
      System.out.println ("Enter your annual income here:\t");
      int aIncome = scan.nextInt(); 
      String numberAsString = String.format("%,d", aIncome);
   
      if (aIncome <= 50000) {
         System.out.println ("Your income:\t\t$" + numberAsString);
         System.out.print ("Your tax bracket:\t5%"); }
       
      else if (50000 < aIncome && aIncome <= 100000) { 
         System.out.println ("Your income:\t\t$" + numberAsString);
         System.out.print ("Your tax bracket:\t15%"); }
      
      else if (100000 < aIncome && aIncome <= 150000) { 
         System.out.println ("Your income:\t\t$" + numberAsString);
         System.out.print ("Your tax bracket:\t20%"); }
      
      else if (150000 < aIncome && aIncome <= 250000) { 
         System.out.println ("Your income:\t\t$" + numberAsString);
         System.out.print ("Your tax bracket:\t30%"); }
      
      else if (250000 < aIncome && aIncome <= 500000) {
         System.out.println ("Your income:\t\t$" + numberAsString);
         System.out.print ("Your tax bracket:\t35%"); }
      
      else if (500000 < aIncome) { 
         System.out.println ("Your income:\t\t$" + numberAsString);
         System.out.print ("Your tax bracket:\t50%"); }
         
      else {
         System.out.println ("Your income:\t\t$" + numberAsString);
         System.out.print ("Unable to calculate your tax bracket."); }
     
   }
}



