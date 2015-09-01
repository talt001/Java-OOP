public void addText(String message, int xPos, int yPos){

	// get a graphics context to use to draw on the
	// buffered image

	Graphics2D graphics2d = bufferedImage.createGraphics();

	// set the color to blue
	graphics2d.setPaint(Color.blue);

	// set the font to Helvetica bold style and size 16
	graphics2d.setFont(new Font("Helvetica",Font.BOLD,16));

	// draw the text
	graphics2d.drawString(message,xPos,yPos);

}//end addText method