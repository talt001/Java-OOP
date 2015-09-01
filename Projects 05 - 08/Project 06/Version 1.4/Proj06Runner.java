

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.Graphics;


public class Proj06Runner extends Proj06{

  public void run(double hello){
	  pic.addMessage("Charles",10,20);
	  //pic = pic.scale(0.95,0.9);
	  pic = rotatePicture(pic,45);

  }//end run
 
  public void run(int hello){
	  pic.addMessage("Charles",10,20);
	  //pic = pic.scale(0.95,0.9);
	  pic = rotatePicture(pic, 315);

  }//end run
  
  public Proj06Runner(){
	    System.out.println("Charles Combs");
	  	}//end constructor
	  
  
  //----------------------------------------------------//

  
  //This method accepts a reference to a Picture object
  // along with a rotation angle in degrees. It creates
  // and returns a new Picture object that is of the
  // correct size to contain and display the incoming
  // picture after it has been rotated around its center
  // by the specified rotation angle and translated to the
  // center of the new Picture object.
  private Picture rotatePicture(Picture pic,double angle){

    //Set up the rotation transform
    AffineTransform rotateTransform =
                                    new AffineTransform();
    rotateTransform.rotate(Math.toRadians(angle),
                           pic.getWidth()/2,
                           pic.getHeight()/2);

    //Get the required dimensions of a rectangle that will
    // contain the rotated image.
    Rectangle2D rectangle2D =
           pic.getTransformEnclosingRect(rotateTransform);
    int resultWidth = (int)(rectangle2D.getWidth());
    int resultHeight = (int)(rectangle2D.getHeight());

    //Set up the translation transform that will translate
    // the rotated image to the center of the new Picture
    // object.
    AffineTransform translateTransform =
                                    new AffineTransform();
    translateTransform.translate(
                      (resultWidth - pic.getWidth())/2,
                      (resultHeight - pic.getHeight())/2);

    //Concatenate the two transforms so that the image
    // will first be rotated around its center and then
    // translated to the center of the new Picture object.
    translateTransform.concatenate(rotateTransform);
    //Create a new Picture object to contain the results
    // of the transformation.
    Picture result = new Picture(resultWidth,resultHeight);

    //Get the graphics context of the new Picture object,
    // apply the transform to the incoming picture and
    // draw the transformed picture on the new Picture
    // object.
    Graphics2D g2 = (Graphics2D)result.getGraphics();
    g2.drawImage(pic.getImage(),translateTransform,null);

    return result;
  }//end rotatePicture
  
  
  //----------------------------------------------------//

  
}//end class Proj06Runner

