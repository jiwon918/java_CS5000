// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 5
// IDE:  jGrasp

public class MyRectangle{
    
   public static boolean isValid(double width, double height)
   {
      double sum;
      sum = width + height;
      
      if(sum > 30) 
         return true;
      else
         return false;
   }
   
   
   
   public static double Area(double width, double height)
   {
      double myArea;
      
      myArea = width * height;
      return myArea;
   }
   
   
   public static double Perimeter(double width, double height)
   {
      double sum = width + height;
      double myPerimeter;
      
      myPerimeter = 2 * sum;
      return myPerimeter; 
   } 
   
}
   
