import java.awt.Color;
import java.util.Scanner;

public class FractalDrawer {

private double totalArea= 0; // member variable for tracking the total area
  

  public FractalDrawer(){


  }


// drawFractal creates a new Canvas object
// and determines which shapes to draw a fractal by calling appropriate helper function
// drawFractal returns the area of the fractal
  
public double drawFractal(String type) {
    Canvas drawing = new Canvas(1000,1000);
    if(type.equals("Triangle")){
      
      
      drawTriangleFractal(250,250,400,500, Color.BLUE, drawing, 7);
    }
   else if(type.equals("Circle")){

     drawCircleFractal(200,500,400,Color.BLUE, drawing, 7);
     
   }

   else if(type.equals("Rectangle")){

    drawRectangleFractal(200,200,350,300, Color.BLUE, drawing, 7);

   }

  return totalArea;
   
}


  

// drawTriangleFractal draws a triangle fractal using recursive techniques
public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level){

     if(level == 0){
       
       
     }
    else{

      //Creating the first triangle
      Triangle theTriangle = new Triangle(x, y, width, height);

    
      //Setting the color and drawing the first triangle
      theTriangle.setColor(c);
      
      can.drawShape(theTriangle);


      //Adding to the total area
      totalArea += theTriangle.calculateArea();
  
      //Recursively drawing the rest of the triangles
      drawTriangleFractal(width / 2.0, height / 2.0, x - (width / 2.0), y, Color.RED, can, level - 1);
      drawTriangleFractal(width / 2.0, height / 2.0, x +(width), y, Color.GREEN, can, level - 1);
      drawTriangleFractal(width / 2.0, height / 2.0, x + (width / 2.0) - (width * 0.25), y - height, Color.BLUE, can, level - 1);
     

      
      
      
      
     
    }
   
  
}

  

// drawCircleFractal draws a circle fractal using recursive techniques
public void drawCircleFractal(double radius, double x, double y, Color c,
Canvas can, int level) {

  if(level == 0){


  }
  else{

  //Creating the first circle
  Circle theCircle = new Circle(x, y, radius);

  //Setting the color and drawing the first circle
   theCircle.setColor(c);

   can.drawShape(theCircle);


   //Adding to the total area
   totalArea += theCircle.calculateArea();


  //Recursively drawing the rest of the circles
   drawCircleFractal(radius / 2.0, x - radius - (radius / 2.0), y, Color.RED, can, level - 1 );
   drawCircleFractal(radius / 2.0, x + radius + (radius / 2.0), y, Color.RED, can, level - 1);
   drawCircleFractal(radius / 2.0, x, y + radius + (radius / 2.0), Color.GREEN, can, level -1);
   drawCircleFractal(radius / 2.0, x, y - radius - (radius / 2.0), Color.BLUE, can, level - 1);




  }

 



}

  

// drawRectangleFractal draws a rectangle fractal using recursive techniques
public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
     
     if(level == 0){

     }
     else{
     
       //Creating the first rectangle
      Rectangle theRectangle = new Rectangle(x,y, width, height);


      //Setting the color and drawing the first circle
      theRectangle.setColor(c);

      can.drawShape(theRectangle);

      //Adding to the total area
      totalArea += theRectangle.calculateArea();
 
      //Recursively drawing the rest of the rectangles
      drawRectangleFractal(width / 2.0, height / 2.0, x - (width / 2.0), y - (height / 2.0), Color.GREEN, can, level-1);
      drawRectangleFractal(width / 2.0, height / 2.0, x + (width) + (width / 2.0), y - (height / 2.0), Color.RED, can, level - 1 );
      drawRectangleFractal(width / 2.0, height / 2.0, x - (width / 2.0), (y + height) + (height / 2.0), Color.BLUE, can, level - 1);
      drawRectangleFractal(width / 2.0, height / 2.0, x + (width) + (width / 2.0), (y + height) + (height / 2.0), Color.GREEN, can, level - 1);      



     }

  

  
}
//The main method asks the user to choose a shape and it will draw a fractal based on their choice
//It will also print out the area of the fractal

public static void main(String[] args){

  Scanner input = new Scanner(System.in);

  System.out.println("Pick a shape: Circle, Triangle, or Rectangle");

  String shape = input.nextLine();

  FractalDrawer fract = new FractalDrawer();

  System.out.println(fract.drawFractal(shape));

  


  
}
}

