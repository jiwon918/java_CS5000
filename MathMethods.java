// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 3

import java.util.Scanner;
public class MathMethods{
   public static void main(String[] args){
   
      Scanner scan = new Scanner(System.in);
   
   // Part A: Negative integer number to absolute value:
      System.out.print("Enter a negative integer number:\t\t\t");
      int abValue = scan.nextInt();
      System.out.println("The absolute value of " + abValue + " is:\t\t\t\t" + (Math.abs(abValue)));
      System.out.println("\t");            //blank space before next part
   
   
   // Part B: Print out the angle's cosine, sine, and tangent values:
      System.out.print("Enter a floating-point number representing an angle:\t");
      float angle = scan.nextFloat();
      System.out.println("The cosine of this angle is:\t\t\t\t" + Math.cos(angle));
      System.out.println("The cosine of this angle is:\t\t\t\t" + Math.sin(angle));
      System.out.println("The cosine of this angle is:\t\t\t\t" + Math.tan(angle));
      System.out.println("\t");            //blank space before next part
   
   
   // Part C: Print out both floor and ceiling values:
      //getting floor value:
      System.out.print("Enter a floating point number:\t\t\t");
      float num = scan.nextFloat();
      double fcValue = num;   // convert float value to double value
      System.out.println("The floor value of " + num + " is:\t\t\t\t" + Math.floor(fcValue)); 
   
     //getting ceiling value:
      System.out.println("The ceiling value of " + num + " is:\t\t\t\t" + Math.ceil(fcValue));
      System.out.println("\t");            //blank space before next part
      
   
   // Part D: Print out the value of X^Y:
      System.out.print("Enter a floating-point number as X:\t\t");
      float x = scan.nextFloat();
      System.out.print("Enter a floating-point number as Y:\t\t");
      float y = scan.nextFloat();
      System.out.println("The value of X^Y is:\t\t\t\t\t\t\t" + Math.pow(x, y)); 
      System.out.println("\t");            //blank space before next part
      
   
   // Part E: Print out the sqaure root of entered value:
      System.out.print("Enter an integer number:\t\t\t\t\t");
      int input = scan.nextInt();
      if (input < 0)
      {
         int value = Math.abs(input);
         System.out.print("The square root of " + input + " is:\t\t\t\t\t" + Math.sqrt(value) + "i");
      } else
      {
         System.out.print("The square root of " + input + " is:\t\t\t\t\t" + Math.sqrt(input));
      
      
      }
   }
}