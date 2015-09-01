//Charles Combs for ITSE 2321 section 008 Prof. Baldwin

public class Proj06Runner extends Proj06{

  private static final int width = pic.getWidth();
  private static final int height = pic.getHeight();

public void run(double hello){

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

  private Picture rotatePicture(Picture pic,double angle){

    AffineTransform rotateTransform = new AffineTransform();
    
    
    rotateTransform.rotate(Math.toRadians(angle), width/2, height/2);
    //rotateTransform.rotate(Math.toRadians(angle), pic.getWidth()/2, pic.getHeight()/2);

    Rectangle2D rectangle2D = pic.getTransformEnclosingRect(rotateTransform);
    int resultWidth = (int)(rectangle2D.getWidth());
    int resultHeight = (int)(rectangle2D.getHeight());

    AffineTransform translateTransform = new AffineTransform();
    
    translateTransform.translate((resultWidth - width/2), (resultHeight - height/2));
    //translateTransform.translate((resultWidth - pic.getWidth())/2, (resultHeight - pic.getHeight())/2);

    translateTransform.concatenate(rotateTransform);
    Picture result = new Picture(resultWidth,resultHeight);

    Graphics2D g2 = (Graphics2D)result.getGraphics();
    g2.drawImage(pic.getImage(),translateTransform,null);

    return result;
  }//end rotatePicture
  

  private Picture flipVertical(BufferedImage image){
  
	  //Flip the image vertically

	  AffineTransform tx = AffineTransform.getScaleInstance(1, -1);

	  tx.translate(0, -image.getHeight());

	  AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);

	  image = op.filter(image, null);

  }
 
}//end class Proj06Runner

