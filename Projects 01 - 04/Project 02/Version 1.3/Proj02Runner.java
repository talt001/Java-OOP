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
			pixel.setRed(255 - pixel.getRed());
			pixel.setGreen(255 - pixel.getGreen());
			pixel.setBlue(127);
		}//end for loop

	x = pic.addMessage("Charles Combs", 10, 20);
		x.setRed(0);
		x.setGreen(0);
		x.setBlue(127);

	pic.explore();
	
	}
}//end class Proj02Runner