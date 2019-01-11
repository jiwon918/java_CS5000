// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 11
// IDE:  jGrasp

import java.text.DecimalFormat;
import java.util.*;
public class MismatchException {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String another = "Y";
      int[] value = new int[3];
      // sentinel loop
      while (another.equalsIgnoreCase("Y")) {
         // getting user input
         System.out.print("Enter three integers:\t");
         while (true) {
            try {
               for (int i = 0; i < 3; i++) {
                  value[i] = scan.nextInt();
               }
               scan.nextLine();
               break;
            } catch (Exception InputMismatchException) {
               System.out.print("Incorrect input, re-enter three integers:\t");
               scan.nextLine();
            }
         }
         // print out the three integers entered by the user
         System.out.print("Numbers:\t");
         for (int i = 0; i < 3; i++) {
            if (i < 2) {
               System.out.print(value[i] + ", ");
            } else
               System.out.print(value[i]);
         }
         System.out.println("");
         // print the average of those three numbers
         DecimalFormat df = new DecimalFormat("#0.00");
         double avg = 0;
         double sum = 0;
         System.out.print("Average:\t");
         for (int i = 0; i < 3; i++) {
            sum = sum + value[i];
         }
         avg = (sum / 3);
         System.out.print(df.format(avg));
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


