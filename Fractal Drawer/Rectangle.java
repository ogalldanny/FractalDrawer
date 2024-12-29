import java.awt.Color;

public class Rectangle{

   //Variables for attributes of the rectangle objects
   private double xPos;
   private double yPos;
   private double width;
   private double height;
   private Color theColor;
  
  
//Constructor to intitialize everything besides the color
  public Rectangle(double theX, double theY, double theWidth, double theHeight){
     xPos = theX;
     yPos = theY;
     width = theWidth;
     height = theHeight;

  }


   //These two methods return the perimeter and area of the rectangles
  public double calculatePerimeter(){

   return (2 * height) + (2 * width);

  }

  public double calculateArea(){

     return (height * width);

  }


//The rest of the methods are getter and setter methods for the rectangle objects
  public void setColor(Color newColor){

   	theColor = newColor;

   }

   public void setPos(double newX, double newY){

    xPos = newX;
    yPos = newY;

   }

   public void setHeight(double newHeight){

   	height = newHeight;

   }

  public void setWidth(double newWidth){

  	width = newWidth;
  }

  public double getHeight(){

  	return height;
  }

  public double getWidth(){

  	return width;
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

}