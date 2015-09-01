public class Proj02Runner {
	private Picture pic = new Picture("Proj02.jpg");
		
	public Proj02Runner() {//constructor
		System.out.println("Charles Combs");
	}//end constructor
		
	public Picture getPicture(){//accessor
		return pic;
	}//end accessor
		
	
		

	public void run(){

		Pixel[] pixelArray = pic.getPixels();
		
		for (Pixel pixel: pixelArray) {
			//pixel.setRed(255 - pixel.getRed());
			pixel.setRed(0);
			pixel.setGreen(255 - pixel.getGreen());
			//pixel.setGreen(0);
			pixel.setBlue(255 - pixel.getBlue());
		}//end for loop

	pic.addMessage("Charles Combs", 10, 20);
	pic.explore();
	
	}
}//end class Proj02Runner