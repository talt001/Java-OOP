class Proj03Runner{
	//Instantiate the Picture object.
	private Picture pic = new Picture("Proj03.jpg");

	public Proj03Runner(){//constructor
		System.out.println("Charles Combs");
	}//end constructor
  //----------------------------------------------------//

	//Accessor method
	public Picture getPicture(){return pic;}
  //----------------------------------------------------//

	//This method is where the action is.
	public void run(){
		pic.addMessage("Charles Combs",10,20);
		//Display a PictureExplorer object.
		//pic.explore();

		//Get an array of Pixel objects.
		Pixel[] pixels = pic.getPixels();

		//Declare working variables
		Pixel pixel = null;
		int green = 0;
		int blue = 0;
		int width = pic.getWidth();
		double greenScale = 0;
		double blueScale = 0;

		//Scale the blue and green color components according
		// to the algorithm given above.
		//Do not scale the red component.
		for(int cnt = 0;cnt < pixels.length;cnt++){
			//Get blue and green values for current pixel.
			pixel = pixels[cnt];
			green = pixel.getGreen();
			blue = pixel.getBlue();

			//Compute the column number and use it to compute
			// the scale factor.
			int col = cnt%width;
			blueScale = (double)(width - col)/width;
			greenScale = (double)(col)/width;

			//Apply the scale factor.
			pixel.setGreen((int)(green * greenScale));
			pixel.setBlue((int)(blue * blueScale));
		}//end for loop

		//Display a PictureExplorer object.
		pic.explore();

	}//end run method
}//end class Proj03Runner