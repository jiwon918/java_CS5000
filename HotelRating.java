// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 9
// IDE:  jGrasp

import java.util.*;
import java.text.NumberFormat;

public class HotelRating
{ 
   private int[][] hotels = new int[3][4];
   private int numOfhotels = 0;
   private int numOfyears = 0;

   HotelRating(int numberH, int numberY) 
   {
      hotels = new int[numberH][numberY];
      numOfhotels = numberH;
      numOfyears = numberY;
      for (int i = 0; i < numOfhotels; i++) 
      {
         for (int j = 0; j < numOfyears; j++) 
         {
            hotels[i][j] = (int) (Math.random() * 5 + 1);
         }
      }
   }

   public int getnumOfhotels()
   {
      return numOfhotels; 
   } 
   
   public int getnumOfyears()
   {
      return numOfyears;
   }



   public int[] fiveStarsHotels()
   {
      int[] fiveStars = new int[numOfhotels];
      int i;
      int count = 0;
      
      for (i = 0; i < numOfhotels; i++)
      {
         fiveStars[i] = -1;
         for(int j = 0; j < numOfyears; j++)
         {
            if (hotels[i][j] == 5)
            {
               fiveStars[count] = i;
               count++;
               break;
            }
         }
      }
      return fiveStars;
   }
   
   public double[] averageRatings()
   {
      double []averageStars = new double[numOfhotels];
      double total = 0;
      double average = 0;
      int i;
   
      for (i = 0; i < numOfhotels; i++)
      {
         total = 0;
         for(int j = 0; j < numOfyears; j++)
         {
            total = total + hotels[i][j];
         }
         average = total/numOfyears;
         averageStars[i] = average;
      }    
      return averageStars;      
   }
   
   
   
   public int[] fourOrMoreStars()
   {
      
      int[] fourOrmore = new int[numOfhotels];
      int i;
      int count = 0;
   
      for (i = 0; i < numOfhotels; i++)
      {
         fourOrmore[i] = -1;
         for(int j = 0; j < numOfyears; j++)
         {
            if (hotels[i][j] >= 4)
            {
               fourOrmore[count] = i;
               count++;
               break;
            }
         }
      }
      return fourOrmore;
   }
   
   
   public boolean anyFiveStars()
   {
      
      boolean anyFive = false;
      int i;
   
      for (i = 0; i < numOfhotels; i++)
      {
         for(int j = 0; j < numOfyears; j++)
         {
            if (hotels[i][j] == 5)
               anyFive= true;
         }
      }
      return anyFive;
   }
      
   public int bestHotel()
   {
      int[] bestBest = new int[numOfhotels];
      int total = 0;
      int i;
      int bestIndex = 0;
   
      for (i = 0; i < numOfhotels; i++)
      {   
         total = 0;
         for(int j = 0; j < numOfyears; j++)
         {
            total = total + hotels[i][j];
         }
         bestBest[i] = total;
      }
   
      for(i = 1; i < numOfhotels; i++)
      {
        if (bestBest[bestIndex] < bestBest[i])
           bestIndex = i;
      }
      return bestIndex;
   }
   
   
   public int worstHotel()
   {
      int[] worstWorst = new int[numOfhotels];
      int total = 0;
      int i;
      int worstIndex = 0;
   
      for (i = 0; i < numOfhotels; i++)
      {   
         total = 0;
         for(int j = 0; j < numOfyears; j++)
         {
            total = total + hotels[i][j];
         }
         worstWorst[i] = total;
      }

      for(i = 1; i < numOfhotels; i++)
      {
        if (worstWorst[worstIndex] > worstWorst[i])
           worstIndex = i;
      }
            
      return worstIndex;
   }
   
   

   public void printChart() 
   {
      System.out.print("\t\t\t\t");
      for(int i = 0; i < numOfyears; i++)
      {
      System.out.print("\t\t\tYear" + (i + 1));
      }
      System.out.println("");
   
      System.out.print("\t\t\t------------");
      for(int i = 0; i < numOfyears; i++)
      {
      System.out.print("------------");
      }   
      System.out.println("");
      
      for (int i = 0; i < numOfhotels; i++) 
      {
         System.out.print("\t\t\tHotel " + (i) + "\t\t");
         for (int j = 0; j < numOfyears; j++) 
         {
            for (int k = 0; k < 5; k++)
            {
               if (k < hotels[i][j])
                  System.out.print("*");
               else
                  System.out.print(" ");
            }
            System.out.print("\t\t\t");
         }
         System.out.println();
      }
      System.out.println();
   }

   
   public void ratingInput()
   {
      Scanner scan = new Scanner(System.in);
      int myRate = 0;
     
      for(int i = 0; i < numOfhotels; i++)
      {
         for(int j = 0; j < numOfyears; j++)
         {
            System.out.print("Enter your rate for Hotel " + i + " in year " + (j + 1) + " (enter 1 to 5 integer):\t");
            myRate = scan.nextInt();
            scan.nextLine();
         
            if(myRate < 1 || myRate > 5)
            {   
               System.out.println("Invalid input. Please try again.");
               j--;
               continue;
            }   
         
            hotels[i][j] = myRate;
         }
      }
   }
}
