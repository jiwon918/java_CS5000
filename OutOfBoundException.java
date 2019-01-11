// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 11
// IDE:  jGrasp

import java.util.*;
import java.util.Random;
public class OutOfBoundException {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String another = "Y";
      int[] value = new int[10];
      // sentinel loop
      while (another.equalsIgnoreCase("Y")) {
         Random Numb = new Random();
         int randNum = 0;
         int index = 0;
         
         for (int i = 0; i < 10; i++) {
            value[i] = Numb.nextInt();
         }
         
         // getting user input
         System.out.print("Enter index value between 0 and 9:\t");
         while (true) {
            try {
               index = scan.nextInt();
               randNum = value[index];
               break;
            } 
            catch (Exception IndexOutOfBoundsException ) {
               System.out.print("Index out of bound, re-enter a valid index:\t");
               scan.nextLine();
            }
         }
         // print out the three integers entered by the user
         System.out.print("The element at index " + index + " is " + randNum);
         
         
         System.out.println("");
         System.out.println("");
         System.out.print("Try again (Y/N) ?\t");
         another = scan.next();
         scan.nextLine();
         System.out.println("");
      }
      System.out.println("Program terminated");
      scan.close();
   }
}

