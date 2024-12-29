import java.awt.Color;

public class Circle{

   //Variables for attributes of the circle objects
   private double xPos;
   private double yPos;
   private double radius;
   private Color theColor;


   //Constructor to intitialize everything besides the color
   public Circle(double theX, double theY, double theRadius){

     xPos = theX;
     yPos = theY;
     radius = theRadius;

   }


  //These two methods return the perimeter and area of the circles
   public double calculatePerimeter(){
      return (radius * 2) * (3.1415);

   }

   public double calculateArea(){

   	return(radius * radius) * (3.1415);
   }


   
  //The rest of the methods are getter and setter methods for the circle objects
   public void setColor(Color newColor){

   	theColor = newColor;

   }

   public void setPos(double newX, double newY){

    xPos = newX;
    yPos = newY;

   }

   public void setRadius(double newRadius){
   	radius = newRadius;
   }

   public Color getColor(){

   	return theColor;
   }

   public double getXPos(){

   	return xPos;
   }

   public double getYPos(){

   	return yPos;
   }

   public double getRadius(){

   	return radius;
   }



}
