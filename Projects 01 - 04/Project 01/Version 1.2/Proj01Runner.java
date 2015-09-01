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
		
		//this code does the turtle dancing seen in the penguin example
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
		for(int ang = 180; ang < 274; ang += 1){

			angRad = Math.toRadians(ang);

			x = (96) + (int)(Math.sin(angRad)*(96));

			y = (100) + (int)(Math.cos(angRad)*(100));

			joe.moveTo(x + 99, y + 46);

		}//end for loop

		joe.setPenColor(Color.GREEN);
		joe.setPenWidth(3);
		
		for(int ang = 274; ang < 361; ang += 1){

			angRad = Math.toRadians(ang);

			x = (100) + (int)(Math.sin(angRad)*(100));

			y = (100) + (int)(Math.cos(angRad)*(100));

			joe.moveTo(x + 99, y + 38);

		}//end for loop 

		joe.moveTo(197,237);
		
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

