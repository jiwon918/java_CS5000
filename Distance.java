// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 1

import java.util.Scanner;
import java.lang.Math;
public class Distance
{
   public static void main(String args[])
   {
   //initializing variables
      double x1 = 0.0;
      double x2 = 0.0;
      double y1 = 0.0;
      double y2 = 0.0;
      double distance = 0.0;
   
   //getting input from the user
      Scanner input = new Scanner(System.in);
      System.out.print("Type x-coordinate of the first point coordinates:  ");
      x1 = input.nextDouble();
      System.out.print("Type y-coordinate of the first point coordinates:  ");
      y1 = input.nextDouble();
   
   //coordinates
      System.out.print("Type x-coordinate of the second point coordinates:  ");
      x2 = input.nextDouble();
      System.out.print("Type y-coordinate of the second point coordinates:  ");
      y2 = input.nextDouble();
      
      
   //distance between two points formula
      distance = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
   
   //result
      System.out.println("First point coordinates:\t(" + x1 + " , " + y1 + ")");
      System.out.println("Second point coordinates:\t(" + x2 + " , " + y2 + ")");
      System.out.print("The distance is:\t\t\t\t" + distance);
   
   
   }



}