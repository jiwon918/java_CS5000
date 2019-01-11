// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 6
// IDE:  jGrasp


import java.util.Scanner;
public class IndexOfLargest
{
   public static int findIndex(int Numbs[])
   {
      int i = 0;
      int j;
      int count = 0;   
      int maxIndex = 0;
   
      for(i = 0; i < 10; i++)
      {
         if (Numbs[i] > Numbs[maxIndex])
            maxIndex = i;  
      }            
      return maxIndex;        
   }

}
