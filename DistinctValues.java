// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 6
// IDE:  jGrasp

import java.util.Scanner;
public class DistinctValues {

   public static int[] getValues(int List[]) {
      int[] afterArray;
      int count = 10;
      int current = 0;
      boolean isExist = false;
      
      for(int i=0;i<10;i++) {
         for(int j=i+1;j<10;j++)   {
            if (List[i] == List[j])   {
               count--;
               break;               
            }
         }         
      }
   
      afterArray = new int[count];
      
      for(int i=0;i<10;i++) {
         isExist = false;
         for(int j=0;j<current;j++) {
            if(afterArray[j] == List[i])
            {
               isExist = true;
               break;
            }
         }
         if(isExist == false) {
            afterArray[current] = List[i];
            current++;
         }
      }
      
      return afterArray;
   }
   
}