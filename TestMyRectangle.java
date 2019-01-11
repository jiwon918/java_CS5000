// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 5
// IDE:  jGrasp

import java.util.Scanner;
public class TestMyRectangle
{
   public static void main(String[] args)
   {    
      double width = 0;                           
      double height = 0;
      boolean recValidity = true;
      double recArea;
      double recPerimeter;
      
      MyRectangle.isValid(width, height);         //calling isValid method
      MyRectangle.Area(width, height);            //calling Area method
      MyRectangle.Perimeter(width, height);       //calling Perimeter method
      
      
         
      Scanner scan = new Scanner(System.in);
   
      
      while (true)                                //allows the user to re-run the program
      {
         System.out.println(" ");
         System.out.print("Enter width:\t");
         width = scan.nextInt();
         System.out.print("Enter height:\t");
         height = scan.nextInt();
         recValidity = MyRectangle.isValid(width,height);
         recArea = MyRectangle.Area(width,height);
         recPerimeter = MyRectangle.Perimeter(width,height);
         
         int myRecArea = (int)recArea;            //casting Double to Integer
         int myRecPerimeter = (int)recPerimeter;  //casting Double to Integer
         
         if (recValidity == true)
         {
            System.out.println("This is valid rectangle");
            System.out.println("The area is " + myRecArea);
            System.out.println("The perimeter is " + myRecPerimeter);
         }  
         else
            System.out.println("This is invalid rectangle");
      }
   
   }
}
  
