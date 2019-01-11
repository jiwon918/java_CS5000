// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 2

import java.lang.Math;
import java.util.Scanner;
public class Circles {
   public static void main(String args[]){
   
   //initializing variables
      double x1 = 0.0;
      double y1 = 0.0;
      double x2 = 0.0;
      double y2 = 0.0;
      double R1 = 0.0;
      double R2 = 0.0;
      double radius = 0.0;
      double distance = 0.0;
   
   
   //user input: coordinates of circle 1
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the x-coordinate of the center point of circle 1:\t");
      x1 = scan.nextDouble();
      System.out.println("Enter the y-coordinate of the center point of circle 1:\t");
      y1 = scan.nextDouble();
   
   //user input: coordinates of circle 2
      System.out.println("Enter the x-coordinate of the center point of circle 2:\t");
      x2 = scan.nextDouble();
      System.out.println("Enter the y-coordinate of the center point of circle 2:\t");
      y2 = scan.nextDouble();
   
   //user input: coordinates of circle 1 and circle 2
      System.out.println("Enter the radius of the circle 1:\t");
      R1 = scan.nextDouble();
      System.out.println("Enter the radius of the circle 2:\t");
      R2 = scan.nextDouble();
   
      radius = R1 + R2; 
   
   //distance between two points formula
      distance = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
   
   
      //outside circle
      if (distance > radius) {
         System.out.println("Circle 1 center is:\t\t" + "(" + x1 + ", " + y1 + ")");   
         System.out.println("Circle 1 radius is:\t\t" + R1);
         System.out.println("Circle 2 center is:\t\t" + "(" + x2 + ", " + y2 + ")");
         System.out.println("Circle 1 radius is:\t\t" + R2);
         System.out.println("Circle 2 is completely outside circle 1");
      }
      
      //inside cirle
      else if (distance <= Math.abs(R1 - R2)) {
         System.out.println("Circle 1 center is:\t\t" + "(" + x1 + ", " + y1 + ")");
         System.out.println("Circle 1 radius is:\t\t" + R1);
         System.out.println("Circle 2 center is:\t\t" + "(" + x2 + ", " + y2 + ")");
         System.out.println("Circle 1 radius is:\t\t" + R2);
         System.out.println("Circle 2 is completely inside circle 1");
      }
      
      //overlapping circle
      else {
         System.out.println("Circle 1 center is:\t\t" + "(" + x1 + ", " + y1 + ")");
         System.out.println("Circle 1 radius is:\t\t" + R1);
         System.out.println("Circle 2 center is:\t\t" + "(" + x2 + ", " + y2 + ")");
         System.out.println("Circle 1 radius is:\t\t" + R2);
         System.out.println("Circle 2 is overlapping with circle 1");
      
      }
   }

}