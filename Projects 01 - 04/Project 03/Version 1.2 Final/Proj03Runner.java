class Proj03Runner{
	private Picture pic = new Picture("Proj03.jpg");

	public Proj03Runner(){
		System.out.println("Charles Combs");
	}

	public Picture getPicture(){return pic;}
  
	public void run(){
		pic.addMessage("Charles Combs",10,20);

		Pixel[] pixels = pic.getPixels();

		Pixel pixel = null;
		int green = 0;
		int blue = 0;
		int width = pic.getWidth();
		double greenScale = 0;
		double blueScale = 0;

		for(int cnt = 0;cnt < pixels.length;cnt++){
			pixel = pixels[cnt];
			green = pixel.getGreen();
			blue = pixel.getBlue();

			int col = cnt%width;
			blueScale = (double)(width - col)/width;
			greenScale = (double)(col)/width;

			pixel.setGreen((int)(green * greenScale));
			pixel.setBlue((int)(blue * blueScale));
		}

		pic.explore();

	}

}