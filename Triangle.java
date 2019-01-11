// Class: CS 5000/01
// Term:  Fall 2018
// Name:  Jiwon Her
// Instructor: Dr. Haddad
// Assignment: 10
// IDE:  jGrasp 

public class Triangle extends GeometricObject {

   // #1 define variables
   private double side1;
   private double side2;
   private double side3;
   private String triName;

   // #2 create a default triangle objects
   public Triangle() {

	      this.triName = "";
	      this.side1 = 1.0;
	      this.side2 = 1.0;
	      this.side3 = 1.0;
   }

   // #3 create a triangle objects w/ user-specific input values
   public Triangle(String triName, double side1, double side2, double side3) {
      this.triName = triName;
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
   }

   // #4 define three access (get)methods
   public double getSide1() {
      return side1;
   }

   public double getSide2() {
      return side2;
   }

   public double getSide3() {
      return side3;
   }

   // #5 define method getArea()
   public double getArea() {
      double s = (side1 + side2 + side3) / 2;
      double Area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
      return Area;
   }

   // #6 define method getPerimeter()
   public double getPerimeter() {
      double triPerimeter = (side1 + side2 + side3);
      return triPerimeter;
   }

   // #7 define method toString()
   public String toString() {
      String mySides;
      mySides = "Triangle:\t" + triName + "\nSide 1:\t\t" + (int)side1 + "\nSide 2:\t\t" + (int)side2 + "\nSide 3:\t\t" + (int)side3
            + "\nArea:\t\t\t" + getArea() + "\nPerimeter:\t" + (int)getPerimeter() + "\n";
      return mySides;

   }

}
