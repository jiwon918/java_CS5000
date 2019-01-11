// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 9
// IDE:  jGrasp

import java.text.NumberFormat;
import java.util.Scanner;

public class TestHotelRating 
{
   public static void main(String[] args) 
   {
      Scanner scan = new Scanner(System.in);
      String another = "Y";
      NumberFormat formatter = NumberFormat.getInstance();
      formatter.setMinimumFractionDigits(2);
      
      int numberH;
      int numberY;
      
      while (another.equalsIgnoreCase("Y")) 
      {
         while(true)      //get the number of hotels with error check (input validation)
         {
         System.out.print("Enter number of hotels (only positive integer please): ");
         numberH = scan.nextInt();
         scan.nextLine();
         
         if(numberH > 0)
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
         
         HotelRating testHotel = new HotelRating(numberH, numberY);
         System.out.print("Enter 1 to use user rating, enter 2 to use random rating: ");
         int value = scan.nextInt();
         scan.nextLine();
         System.out.println();
         
         if(value == 1)
         {
            // User input  
            System.out.println("Let's use your rating!");
            testHotel.ratingInput();
         }
         else if (value != 2)
         {
            System.out.println("Wrong input. Try again!");
            continue;   
         }
         
         // #1 five stars hotels 
         int[] fiveStars = testHotel.fiveStarsHotels();
         System.out.print("Five stars hotels indices: ");
         for(int i = 0; i < testHotel.getnumOfhotels(); i++)
         {
            if(fiveStars[0] == -1)
            {
               System.out.print("None");
               break;
            }
            if(fiveStars[i] > -1 && i == 0)
               System.out.print(fiveStars[i]);
            else if(fiveStars[i] > -1)
               System.out.print(", " + fiveStars[i]);
         }
         System.out.println();
         
         // #2 average ratings of each hotel 
         System.out.println("Average Ratings are: ");
         double[] averageStars = testHotel.averageRatings();
         
         for(int i = 0; i < testHotel.getnumOfhotels(); i++)
         {
            System.out.println("\t\tHotel " + i + " :   " + formatter.format(averageStars[i]));
         } 
      
         // #3 hotels with four or more stars  
         int[] fourOrmore = testHotel.fourOrMoreStars();
         System.out.print("Four or more stars hotels indices: ");
      
         for(int i = 0; i < testHotel.getnumOfhotels(); i++)
         {
            if(fourOrmore[0] == -1)
            {
               System.out.print("None");
               break;
            }
            if(fourOrmore[i] > -1 && i == 0)
               System.out.print(fourOrmore[i]);
            else if(fourOrmore[i] > -1)
               System.out.print(", " + fourOrmore[i]);
         }
         System.out.println();
      
         // #4 any five star earned hotel  
         System.out.print("Any five stars hotel? ");
         boolean anyFive = testHotel.anyFiveStars();
      
         if(anyFive == true)
            System.out.print("True");
         else 
            System.out.print("False");
         System.out.println();
      
         // #5 best hotel 
         int bestIndex = testHotel.bestHotel();
         System.out.print("Best hotel index: " + bestIndex);
         System.out.println();
         
         // #6 worst hotel 
         int worstIndex = testHotel.worstHotel();
         System.out.print("Worst hotel index: " + worstIndex);
         System.out.println();
         
         // #7 print the hotel chart
         System.out.println("Ratings chart: ");
         testHotel.printChart();
         System.out.println();
      
         System.out.print("Try again (Y/N) ?\t");
         another = scan.next();
         scan.nextLine();
         System.out.println("");
      }
      System.out.println("Program terminated");
       
      
   }
}