import java.awt.*;
import bookClasses.*;

class Proj01Runner{
	private World mars = new World(394,295);
	private Turtle joe = new Turtle(mars);
	private Turtle sue = new Turtle(mars);

	public Proj01Runner(){//constructor
		System.out.println("Charles Combs");
	}//end constructor
	
	public Turtle getJoe(){
		return(joe);
	}
	public Turtle getSue(){
		return(sue);
	}
	public World getMars(){
		return(mars);
	}
		
	public void run(){
		//initialize variables
		double angRad = 0;
		int x = 0;
		int y = 0;
				
		mars.setPicture(new Picture ("Proj01.jpg"));
	
		mars.getPicture().addMessage("Charles Combs",10,20);
		
		//code below assigns states and behavior to the turtle objects
		joe.setName("joe");
		
		joe.setBodyColor(Color.YELLOW);
		joe.setShellColor(Color.RED);
		
		joe.setPenColor(Color.YELLOW);
		joe.setPenWidth(3);
		joe.forward();

		joe.turn(+90);
    		
		joe.setPenColor(Color.RED);
		joe.setPenWidth(1);
		
		//at the top of the 100 pixel run, now red and one wide, facing east
		for(int ang = 180; ang < 270; ang += 1){

			angRad = Math.toRadians(ang);

			x = (197) + (int)(Math.sin(angRad)*(100));

			y = (147) + (int)(Math.cos(angRad)*(100));

			joe.moveTo(x, y);

		}//end for loop

		joe.setPenColor(Color.GREEN);
		joe.setPenWidth(3);
		
		for(int ang = 271; ang < 361; ang += 1){

			angRad = Math.toRadians(ang);

			x = (197) + (int)(Math.sin(angRad)*(100));

			y = (137) + (int)(Math.cos(angRad)*(100));

			joe.moveTo(x, y);

		}//end for loop
		
		sue.setName("sue");
		
		sue.setPenWidth(2);
		sue.setPenColor(Color.BLUE);
			
		sue.moveTo(237,187);
		sue.setPenDown(false);
		
		sue.moveTo(277,227);
		sue.setPenDown(true);
		
		sue.moveTo(317,267);
		
	}//end run method
}//end class Prob01Runner

