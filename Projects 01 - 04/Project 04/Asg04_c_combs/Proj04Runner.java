//Charles Combs for ITSE 2321 section 008 Prof. Baldwin

class Proj04Runner{
  public Proj04Runner(){
    System.out.println("Charles Combs");
  }

  public Picture run(){
    Picture pix = new Picture("Proj04.jpg");
    
    pix.addMessage("Charles Combs.",10,20);

    pix = mirrorUpperQuads(pix);
    //Mirror the top half into the bottom half.
    pix = mirrorHoriz(pix);
    pix.explore();
    return pix;

  }

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
      }
    }

    return pix;
  }

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

      }
    }

    return pix;
  }
  
}