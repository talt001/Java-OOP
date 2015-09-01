class Proj04Runner{
  public Proj04Runner(){
    System.out.println("Charles Combs");
  }//end constructor
  //----------------------------------------------------//
  public Picture run(){
    Picture pix = new Picture("Proj04.jpg");
    //Display the input picture.
    //pix.explore();

    pix.addMessage("Charles Combs.",10,20);

    //Call the mirrorUpperQuads method to modify the top
    // half of the picture.
    pix = mirrorUpperQuads(pix);
    //Mirror the top half into the bottom half.
    pix = mirrorHoriz(pix);
    //Add your name and display the output picture.
    //pix.addMessage("Charles Combs.",10,20);
    pix.explore();
    return pix;

  }//end run
  //----------------------------------------------------//

  //This method mirrors the upper-left quadrant of a
  // picture into the upper-right quadrant.
  private Picture mirrorUpperQuads(Picture pix){
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int midpoint = pix.getWidth()/2;
    int width = pix.getWidth();
    for(int row = 0;row < pix.getHeight()/2;row++){
      for(int col = 0;col < midpoint;col++){
        leftPixel = pix.getPixel(col,row);
        rightPixel =
                   pix.getPixel(width-1-col,row);
        rightPixel.setColor(leftPixel.getColor());
      }//end inner loop
    }//end outer loop

    return pix;
  }//end mirrorUpperQuads
  //----------------------------------------------------//

  //This method mirrors the top half of a picture into
  // the bottom half.
  private Picture mirrorHoriz(Picture pix){
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int midpoint = pix.getHeight()/2;
    int height = pix.getHeight();
    for(int col = 0;col < pix.getWidth();col++){
      for(int row = 0;row < midpoint;row++){
        topPixel = pix.getPixel(col,row);
        bottomPixel =
                   pix.getPixel(col,height-1-row);
        bottomPixel.setRed(255 - topPixel.getRed());
	bottomPixel.setGreen(255 - topPixel.getGreen());
	bottomPixel.setBlue(255 - topPixel.getBlue());

      }//end inner loop
    }//end outer loop

    return pix;
  }//end mirrorHoriz
  //----------------------------------------------------//
}//end class Proj04Runner


///*Pixel[] pixelArray = pic.getPixels();
//		
//		for (Pixel pixel: pixelArray) {
//			pixel.setRed(255 - pixel.getRed());
//			pixel.setGreen(255 - pixel.getGreen());
//			pixel.setBlue(127);
//		}*/
