// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 8
// IDE:  jGrasp

import java.util.*;

public class TestRectangle {

   public static void main(String[] args) {
      Rectangle myRectangle = new Rectangle();

      Scanner scan = new Scanner(System.in);
      String another = "Y";
      double width = 0;
      double height = 0;

      while (another.equalsIgnoreCase("Y")) {
         System.out.print("Input width, height of hisRectangle(ex>  3.0  10.0): ");
         width = scan.nextDouble();
         height = scan.nextDouble();
         Rectangle hisRectangle = new Rectangle(width, height, "hisRectangle");
         scan.nextLine();
         
         System.out.print("Input width, height of herRectangle(ex>  3.0  10.0): ");
         width = scan.nextDouble();
         height = scan.nextDouble();
         Rectangle herRectangle = new Rectangle(width, height, "herRectangle");
         scan.nextLine();

         System.out.println();
         
         printRectangle(myRectangle);
         printRectangle(hisRectangle);
         printRectangle(herRectangle);
         
         System.out.println(myRectangle);
         System.out.println(hisRectangle);
         System.out.println(herRectangle);
         System.out.println();
         
         System.out.print("Try again (Y/N) ?\t");
         another = scan.next();
         System.out.println();
      }
      System.out.println("Program terminated");
   }
   
   public static void printRectangle(Rectangle tempRectangle) {
      
      System.out.println(tempRectangle.getName());
      System.out.println("---------------");
      System.out.println("Width:\t\t" + String.format("%.2f", tempRectangle.getWidth()));
      System.out.println("Height:\t\t" + String.format("%.2f", tempRectangle.getHeight()));
      System.out.println("Area:\t\t\t" + String.format("%.2f", tempRectangle.getArea()));
      System.out.println("Perimeter:\t" + String.format("%.2f", tempRectangle.getPerimeter()));
      System.out.println();
   }
}