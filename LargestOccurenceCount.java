// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 4
// IDE:  jGrasp
     
import java.util.Scanner;

public class LargestOccurenceCount
{
   public static void main(String[] args) 
   {  
      int count = 0;
      int value;
      int MAX = 0;
      Scanner scan = new Scanner(System.in);
      int msgflag = 0;
      String str = "You entered:\t  ";
     
     while (true)
     { 
      System.out.print("Enter positive integers (0 to quit):\t");     
   
      while ((value = scan.nextInt()) != 0)
      {   
         if(value > MAX)
         {
            MAX = value;
            count = 1;
         } 
         else if (value == MAX)
            count++;
         if(value > 0)
            str = str.concat(" " + Integer.toString(value));     
      }   
      System.out.println(str);
      System.out.println("Largest value:\t\t" + MAX);
      System.out.println("Occurrences:\t\t" + count + " times");    
     }    
   }
}
