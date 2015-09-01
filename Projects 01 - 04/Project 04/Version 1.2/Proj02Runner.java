//Charles Combs for ITSE 2321 section 008 Prof. Baldwin

public class Proj02Runner {
	private Picture pic = new Picture("Proj02.jpg");
		
	public Proj02Runner() {
		System.out.println("Charles Combs");
	}
		
	public Picture getPicture(){
		return pic;
	}

	public void run(){

		pic.addMessage("Charles Combs", 10, 20);
		
		Pixel[] pixelArray = pic.getPixels();
		
		for (Pixel pixel: pixelArray) {
			pixel.setRed(255 - pixel.getRed());
			pixel.setGreen(255 - pixel.getGreen());
			pixel.setBlue(127);
		}

	pic.explore();

	}

}