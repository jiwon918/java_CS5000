// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 4
// IDE:  jGrasp


import java.util.Scanner;
public class SandClock
{
   public static void main(String[] args)
   {
      int level=5;
      
      for(int i = level; i > 0; i--){
         
         for(int j = 0; j < level-i; j++) 
            System.out.print(" ");
         
         for (int j = 1; j <= i*2-1; j++)
            System.out.print("*");
         
         if(i>0)
            System.out.println();
         
      }
      
      for(int i = 2; i < level+1; i++){
         
         for(int j = 0; j < level-i; j++) 
            System.out.print(" ");
         
         
         for (int j = 1; j <= i*2-1; j++)
            System.out.print("*");
         
         if(i<level) 
            System.out.println();
         
      }
   }
}