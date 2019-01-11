// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 8
// IDE:  jGrasp

public class Rectangle {

   private double width;
   private double height;
   private String name;
   
   Rectangle(){
      this.width = 1.0;
      this.height = 1.0;
      this.name = "myRectangle";
   }
   
   Rectangle(double width, double height, String name){
      this.width = width;
      this.height = height;
      this.name = name;
   }
   
   public double getWidth() {
      return this.width;
   }
   public double getHeight() {
      return this.height;
   }
   public double getArea() {
      return this.width*this.height;
   }
   public String getName() {
      return this.name;
   }
   public double getPerimeter() {
      return (this.width+this.height)*2.0;
   }
   
   public String toString() {
      return ("Rectangle " + this.name + " is " + this.width + " unit wide and " + this.height + " unit high.");
   }
}