public class Proj02Runner {
	private Picture pic = new Picture("Proj02.jpg");
		
	public Proj02Runner() {//constructor
		System.out.println("Charles Combs");
	}//end constructor
		
	public Picture getPicture(){//accessor
		return pic;
	}//end accessor

	public void run(){

		pic.addMessage("Charles Combs", 10, 20);
		
		Pixel[] pixelArray = pic.getPixels();
		
		for (Pixel pixel: pixelArray) {
			pixel.setRed(255 - pixel.getRed());
			pixel.setGreen(255 - pixel.getGreen());
			pixel.setBlue(127);
		}//end for loop

	pic.explore();

	}
}//end class Proj02Runner