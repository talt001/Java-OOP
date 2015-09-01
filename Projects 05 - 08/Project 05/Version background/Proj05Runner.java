import java.awt.Color;

class Proj05Runner extends Proj05{

	  public Proj05Runner(){//constructor
	    System.out.println("Charles Combs.");
	  }//end constructor


	  
	  
	  public void run(){

		ComplicatedPicture skater = new ComplicatedPicture("Proj05a.bmp");
	    skater = crop(skater,6,59,392,293);


	    ComplicatedPicture hole = new ComplicatedPicture("Proj05b.bmp");
	    hole = crop(hole,6,59,392,293);


	    ComplicatedPicture snowScene = new ComplicatedPicture("Proj05c.jpg");
	    snowScene = crop(snowScene,6,59,392,293);

	    
	    
	    
	    darkenBackground(hole,snowScene);   
	    greenTint(skater);
	    greenScreenDraw(skater,snowScene,0,0);
	    snowScene.addMessage("Charles Combs.",10,15);

	    
	    
	    
	    snowScene.explore();
	    System.out.println(snowScene);

	  }//end run method


	  
	  
	  private void greenTint(ComplicatedPicture pic){
	    Pixel[] pixels = pic.getPixels();
	    
	    Color color = null;
	    int red = 0;
	    int green = 0;
	    int blue = 0;
	    
	    for(int cnt = 0;cnt < pixels.length;cnt++){
	      color = pixels[cnt].getColor();

	      if(!(color.equals(Color.GREEN))){

	    	  green = color.getGreen();
	    	  	if(green * 1.25 < 255){
	    	  		green = (int)(green * 1.25);
	    	  	}else{
	    	  		green = 255;
	    	  	}//end else
	    	 	    	  	
	      blue = (int)(color.getBlue()*0.8);
	      red = (int)(color.getRed()*1.0);
	      if(red * 1.25 < 255){
	    	  red = (int)(red * 1.25);
	      }else{
	    	  red = 255;
	      }

	      pixels[cnt].setColor(new Color(red,green,blue));
	      }//end if
	      
	    }//end for
	    
	  }//end greenTint

	  
	  

	  private void darkenBackground(ComplicatedPicture pattern, ComplicatedPicture dest){

	    Pixel[] patternPixels = pattern.getPixels();
	    Pixel[] destPixels = dest.getPixels();
	    
	    
	    Color color = null;
	    int red = 0;
	    int green = 0;
	    int blue = 0;
	    

	    for(int cnt = 0;cnt < patternPixels.length;cnt++){
	      color = patternPixels[cnt].getColor();
	      
	      if(color.equals(Color.GREEN)){
	        color = destPixels[cnt].getColor();
	        destPixels[cnt].setColor(color.darker());
	        
	      }else{

	        color = destPixels[cnt].getColor();
	        red = color.getRed();
	        if(red*1.25 < 255){
	          red = (int)(red * 1.25);
	        }else{
	          red = 255;
	        }//end else
	        green = (int)(color.getGreen() * 1.0);
	        blue = (int)(color.getBlue() * 0.8);
		    if(green * 1.25 < 255){
		    	green = (int)(green * 1.25);
		    	}else{
		    		green = 255;
		    	}
		    
	        destPixels[cnt].setColor(new Color(red,green,blue)); 
	      }//end else
	      
	    }//end for
	    
	  }//end darkenBackground


	  
	  
	  private void greenScreenDraw(ComplicatedPicture source, ComplicatedPicture dest, int destX, int destY){
		  
	    int width = source.getWidth();
	    int height = source.getHeight();
	    Pixel pixel = null;
	    Color color = null;

	    for(int row = 0;row < height;row++){
	      for(int col = 0;col < width;col++){
	        color = source.getPixel(col,row).getColor();
	        
	        if(!(color.equals(Color.GREEN))){
	          pixel = dest.getPixel(destX + col,destY + row);
	          pixel.setColor(color);
	        }//end if
	        
	      }//end inner loop
	      
	    }//end outer loop

	  }//end greenScreenDraw

	  
	  	  

	  private ComplicatedPicture crop(ComplicatedPicture pic, int startCol, int startRow, int width, int height){
		  
		  ComplicatedPicture output = new ComplicatedPicture(width,height);

	    int colOut = 0;
	    int rowOut = 0;
	    int col = 0;
	    int row = 0;
	    Pixel pixel = null;
	    Color color = null;
	    
	    for(col = startCol;col < startCol+width;col++){
	      for(row = startRow;row < startRow+height;row++){
	    	  
	        color = pic.getPixel(col,row).getColor();
	        pixel = output.getPixel(colOut,rowOut);
	        pixel.setColor(color);
	        rowOut++;
	      }//end inner loop
	      
	      rowOut = 0;
	      colOut++;
	    }//end outer loop
	    
	    return output;
	  }//end crop

	}//end class Proj05Runner
