// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 2

import java.util.Scanner;
public class PhoneBill {
   public static void main(String[] args) {
   
      double rCost = 0;
      double pdCost = 0;
      double pnCost = 0;
      int daymin = 0;
      int nightmin = 0;
      int min = 0;
      double totalCost = 0;
      
      Scanner scan = new Scanner(System.in);
      
      
      System.out.println("Enter your account number here:\t");
      int account = scan.nextInt();
      
      
      System.out.println("Enter your service code here:\t");
      char code = scan.next().charAt(0);  
                
      if (code == 'R' || code == 'r') {
         System.out.println ("Enter the number of minutes used:\t");
         min = scan.nextInt();    
         System.out.println(min);
           
         if (min <= 50) {
            rCost = 10;
            System.out.println ("Account Number:\t" + account);
            System.out.println ("Service Type:\t\tRegular");
            System.out.println ("Total minutes:\t\t" + min);
            System.out.println ("Amount due:\t\t\t$" + String.format("%.2f",rCost)); }
            
         else if (min > 50) {
            rCost = ((min - 50) * 0.20) + 10 ;
            System.out.println ("Account Number:\t" + account);
            System.out.println ("Service Type:\t\tRegular");
            System.out.println ("Total minutes:\t\t" + min);
            System.out.println ("Amount due:\t\t\t$" + String.format("%.2f",rCost)); }
      }
           
      else if (code == 'P' || code == 'p') {
      
         System.out.println ("How many minutes did you used during the day?");
         daymin = scan.nextInt();
               
         System.out.println ("How many minutes did you used during the night?");
         nightmin = scan.nextInt();
               
         //calculating the overtime eerrrr      
         if (daymin <= 75) 
            pdCost = 0;         
         else if (daymin > 75) 
            pdCost = ((daymin - 75) * 0.10);       
            
            
            //overcharge for night time
         if (nightmin <= 100) 
            pnCost = 0;          
         else if (nightmin > 100) 
            pnCost = ((nightmin - 100) * 0.05);
            
                 
      
         totalCost = pdCost + pnCost + 25;
      
         System.out.println ("Account Number:\t" + account);
         System.out.println ("Service Type:]t\tPremium");
         System.out.println ("Total minutes:\t\t" + (daymin + nightmin));
         System.out.println ("Amount due:\t\t\t$" + String.format("%.2f",totalCost)); 
      
      
      
      } 
   
   }
}
   
   
 