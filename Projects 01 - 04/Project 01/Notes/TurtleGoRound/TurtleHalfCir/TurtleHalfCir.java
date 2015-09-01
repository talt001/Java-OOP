import java.awt.*;
public class TurtleHalfCir{
  public static void main(String[] args){
    int width = 200;
    int height = 200;
    World mars = new World(width,height);
    //Put a turtle in the center of the world
    Turtle joe = new Turtle(mars);
    joe.setVisible(false);//make turtle invisible
    joe.setPenDown(false);//pick up the pen
    joe.moveTo(width,height/2);//move turtle to right edge
    joe.setPenDown(true);//drop the pen
    joe.setPenWidth(5);

    //Declare and initialize working variables
    double angRad = 0;
    int x = 0;
    int y = 0;
    int red = 255;
    int green = 0;
    int blue = 255;
    joe.setPenColor(new Color(red,green,blue));

    //Make turtle move in a circle changing the pen color
    // along the way.
    for(int ang = 0;ang < 361;ang += 1){
      angRad = Math.toRadians(ang);
      x = width/2 + (int)(Math.cos(angRad)*width/2);
      y = height/2 + (int)(Math.sin(angRad)*height/2);
      //Modify the green and blue color components
      green = (int)(ang*255/360.0);//increase
      blue = 255 - (int)(ang*255/360.0);//decrease
      joe.setPenColor(new Color(red,green,blue));
      joe.moveTo(x,y);
    }//end for loop

  }//end main

}//end class Main