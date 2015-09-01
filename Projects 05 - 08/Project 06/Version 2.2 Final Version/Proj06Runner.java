//Charles Combs for ITSE 2321 section 008 Prof. Baldwin


import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.Graphics;


public class Proj06Runner extends Proj06{
	
	

  private static final int width = pic.getWidth();
  private static final int height = pic.getHeight();



  public void run(double hello){
	
	  pic = Flip();
	
	  pic.addMessage("Charles Combs",10,20);
	  
	  pic = rotatePicture(pic,45);

  }//end run
 
  public void run(int hello){
	  pic.addMessage("Charles Combs",10,20);
	  
	  pic = rotatePicture(pic, 315);

  }//end run
  
  public Proj06Runner(){
	    System.out.println("Charles Combs");
	  	}//end constructor
  
  private Picture Flip(){//method
	
		Picture output = new Picture("Proj06.jpg");

		Pixel pixel = null;
		Color color = null;
		
		for(int col = 0; col < width; col++){
			for(int row = 0; row < height; row++){
				color = pic.getPixel(col,row).getColor();
				pixel = output.getPixel(width - col - 1, row);
				pixel.setColor(color);
				}//end inner loop
			}//end outer loop
		
		return output;
		
	}//end Flip
  
  private Picture rotatePicture(Picture pic,double angle){

	    AffineTransform rotateTransform = new AffineTransform();
	    	    
	    rotateTransform.rotate(Math.toRadians(angle), pic.getWidth()/2, pic.getHeight()/2);

	    Rectangle2D rectangle2D = pic.getTransformEnclosingRect(rotateTransform);
	    int resultWidth = (int)(rectangle2D.getWidth());
	    int resultHeight = (int)(rectangle2D.getHeight());

	    AffineTransform translateTransform = new AffineTransform();
	    
	    translateTransform.translate((resultWidth - pic.getWidth())/2, (resultHeight - pic.getHeight())/2);

	    translateTransform.concatenate(rotateTransform);
	        
	    Picture result = new Picture(resultWidth,resultHeight);

	    Graphics2D g2 = (Graphics2D)result.getGraphics();
	    g2.drawImage(pic.getImage(),translateTransform,null);

	    return result;
	    
	  }//end rotatePicture

   
}//end class Proj06Runner

