// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 6
// IDE:  jGrasp

import java.util.Scanner;
public class CountOccurrences
{
   
   public static void main(String[] args)
   {
      int[] List = new int[10];
      Scanner scan = new Scanner(System.in);
      int input;
      int count = 0;
      int i = 0; 
      String another = "Y";   
         
      while (another.equalsIgnoreCase("Y"))
      { 
         count = 0;
         
         for(i = 0; i < 10; i++)
            List[i] = 0;
               
         System.out.println("Entered integers between 1 and 100 (0 to quit):\t");
         input = scan.nextInt();
         
               
         i = 0;
         
         while(input != 0)
         {
            if (input > 0 && input <=100)
            {
               List[i] = input;
               i++;
            }
            input = scan.nextInt();
         
         }
            
         Count(List);
         System.out.println("");
         System.out.print("Try again (Y/N) ?\t");
         another = scan.next();
         System.out.println("");
         
      } 
      System.out.println("Program terminated"); 
   }
      
      
   public static void Count(int List[])
   {
      int i, j, count;
      int length = 0; 
      
      for(i = 0; i < 10; i++)
         if(List[i] == 0)
         {
            length = i;
            break; 
         }
         
      for(i = 0; i < List.length-1; i++)
      {
         if(List[i] == -1)
            continue;
         count = 1;
         for(j = i + 1; j < List.length-1; j++)
         {  
            if(List[i] == List[j])
            {
               count++;
               List[j] = -1;
            }
         }
         System.out.println(List[i] + " occurred" + ((List[i] / 100 > 0) ? "\t" : "\t\t") + count + " " + ((count == 1) ? "Time" : "Times"));
      }  
      
      
      
   }
         
         
     
     
}
  
   
   
   
   
