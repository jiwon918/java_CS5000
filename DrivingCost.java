// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 1

import java.util.Scanner;
public class DrivingCost{
   public static void main(String args[]){
   
   //initializing variables
      double miles = 0.0;
      double mpg = 0.0;
      double dollars = 0.0;
      double dollarsTotal = 0.0;
;
    //getting input from the user
      Scanner input = new Scanner(System.in);
      System.out.print("The distance (miles):   ");
      miles = input.nextDouble();
      
      System.out.print("Fuel efficiency (mpg):  ");
      mpg = input.nextDouble();
      
      System.out.print("Price per gallon (dollars):   ");
      dollars = input.nextDouble();
      
    //calculation formula for the trip cost
      dollarsTotal = ((miles/mpg)*dollars);
      
       //result
      System.out.println("The distance (miles):         " + miles);
      System.out.println("Fuel efficiency (mpg):        " + mpg);
      System.out.println("Price per gallon (dollars):   " + dollars);
      System.out.print("The trip cost (dollars):      $" + dollarsTotal);
      
   
   
   
   }
   
}
    
