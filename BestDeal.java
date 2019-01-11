// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 2

import java.util.Scanner;
public class BestDeal {
   public static void main(String args[]){
   
    //use double for more accurate comparison
      double sWeight;
      double sPrice;
      double bWeight;
      double bPrice;
   
   
    //user input 
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the weight of the small box:\t");
      sWeight = scan.nextInt();
      System.out.print("Enter the price of the small box:\t");
      sPrice = scan.nextInt();
      System.out.print("Enter the weight of the large box:\t");
      bWeight = scan.nextInt();
      System.out.print("Enter the price of the large box:\t");
      bPrice = scan.nextInt();
      
    //price per pound of each apple in box
      double sBox = (sPrice / sWeight);
      double bBox = (bPrice / bWeight);
   
    //convert the double values into int values so that the output will show int values   
      int smaWeight = (int)sWeight;
      int smaPrice = (int)sPrice;
      int larWeight = (int)bWeight;
      int larPrice = (int)bPrice;   
    
    //compare the price per pound of apples in small box to the large box   
      if (sBox < bBox) 
      {
                       
         System.out.println("Small box weight:\t" + smaWeight + " Pounds");
         System.out.println("Small box price:\t" + smaPrice + " Dollars");
         System.out.println("Large box weight:\t" + larWeight + " Pounds");
         System.out.println("Large box price:\t" + larPrice + " Dollars");
         System.out.println("Judgment:\t\t\tThe smaller box is a better deal");   
      }
      
      else if (sBox > bBox)
      {
         System.out.println("Small box weight:\t" + smaWeight + " Pounds");
         System.out.println("Small box price:\t" + smaPrice + " Dollars");
         System.out.println("Large box weight:\t" + larWeight + " Pounds");
         System.out.println("Large box price:\t" + larPrice + " Dollars");
         System.out.println("Judgment:\t\t\tThe large box is a better deal");   
      }
      
      
      else // (sBox == bBox) 
      {
         System.out.println("Small box weight:\t" + smaWeight + " Pounds");
         System.out.println("Small box price:\t" + smaPrice + " Dollars");
         System.out.println("Large box weight:\t" + larWeight + " Pounds");
         System.out.println("Large box price:\t" + larPrice + " Dollars");
         System.out.println("Judgment:\t\t\tBoth boxes are of the same value");   
      }
      
      
   }
    
}