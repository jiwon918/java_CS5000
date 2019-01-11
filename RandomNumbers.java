// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 3

import java.util.*;
public class RandomNumbers{
   public static void main(String[] args){
   
      int answer1, answer2, answer3;
      int MIN;
      int MAX;
      float min;
      float max;  
      float answer4;
   
      Scanner scan = new Scanner (System.in); //scanner object
      
   // Part A: Generate random integer number between 25 and 85 (inclusive):
      Random generator1 = new Random(); //number generator object
      MIN = 25;
      MAX = 85;
      answer1 = generator1.nextInt(MAX - MIN + 1) + MIN;
      //System.out.println("A random integer number between 25 and 85 (inclusive):\t\t" + answer1);
     
   // Part B: Generate random integer number between -10 and 20 (inclusive):
      Random generator2 = new Random();
      MIN = -10;
      MAX =  20;
      answer2 = generator2.nextInt(MAX - MIN + 1) + MIN;
      //System.out.println("A random integer number between -10 and 20 (inclusive):\t\t" + answer2);
   
   // Part C: Generate random integer number between -30 and -50 (inclusive):
      Random generator3 = new Random();
      MIN = -50;
      MAX = -30;
      answer3 = generator3.nextInt(MAX - MIN + 1) + MIN;
      //System.out.println("A random integer number between -30 and -50 (inclusive):\t\t" + answer3);
     
     
   // Part D: Generate random floating-point between 0.0 and 17.9999 (inclusive):
      Random generator4 = new Random();
      min = 0.0f;
      max = 17.9999f;
      answer4 = generator4.nextFloat()*(max - min) + min;
      //System.out.println("A random float number between 0.0 and 17.9999 (inclusive):\t" + answer4);     
     
   
     // output:
      System.out.println("a) A random integer between 25 and 85 (inclusive):\t\t\t" + answer1);
      System.out.println("b) A random integer between -10 and 20 (inclusive):\t\t" + answer2);
      System.out.println("c) A random integer between -30 and -50 (inclusive):\t\t" + answer3);
      System.out.println("d) A random float between 0.0 and 17.9999 (inclusive):\t" + answer4);
     
     
   }
}