//import java.lang.Object;
import java.awt.*;
import bookClasses.*;

//import bookClasses.SimplePicture;
//import bookClasses.Picture;
//import bookClasses.World;
//import bookClasses.Turtle;
//import bookClasses.Pen;

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
		int radius = 100;

                mars.setPicture(new Picture ("Proj01.jpg"));
	
		mars.getPicture().addMessage("Charles Combs",10,20);
		
		//this code does the turtle dancing seen in the penguin example
		joe.setName("joe");
		
		joe.setBodyColor(Color.YELLOW);
		joe.setShellColor(Color.GREEN);
		
		joe.setPenColor(Color.YELLOW);
		joe.setPenWidth(3);
		joe.forward();

		joe.turn(+90);
		
		joe.setPenColor(Color.RED);
		joe.setPenWidth(1);

                //at the top of the 100 pixel run, now red and one wide, facing east		
                for(int ang = 360;ang < 270; ang--){

                    	angRad = Math.toRadians(ang);

                    	x = radius + (int)(Math.sin(angRad)*radius);

                    	y = radius + (int)(Math.sin(angRad)*radius);

                    	joe.moveTo(x,y);

                }//end for loop 


                //joe.moveTo(97,147);

		//joe.setPenColor(Color.GREEN);
		//joe.setPenWidth(3);
		//joe.moveTo(197,237);
		
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

