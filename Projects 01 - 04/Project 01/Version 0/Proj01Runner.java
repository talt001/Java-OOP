//import java.lang.Object;
import java.awt.Color;
import bookClasses.*;
//import bookClasses.SimplePicture;
//import bookClasses.Picture;
//import bookClasses.World;
//import bookClasses.Turtle;
//import bookClasses.Pen;

class Proj01Runner{

	private World mars = new World(300,274);
	private Turtle joe = new Turtle(mars);
	private Turtle sue = new Turtle(mars);

	public Proj01Runner(){//cosntructor
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
		mars.setPicture(new Picture ("Proj01.jpg"));
	
		mars.getPicture().addMessage("Charles Combs",10,20);
		
		//this code does the turtle dancing seen in the penguin example
		joe.setName("joe");
		
		joe.setBodyColor(Color.RED);
		joe.setShellColor(Color.BLUE);
		
		joe.setPenColor(Color.YELLOW);
		joe.setPenWidth(3);
		
		joe.forward();
		
		joe.turn(-135);
		joe.setPenColor(Color.BLUE);
		joe.forward(150);
		
		sue.setName("sue");
		
		sue.setPenWidth(2);
		sue.setPenColor(Color.RED);
			
		sue.moveTo(183,203);
		sue.setPenDown(false);
		
		sue.moveTo(216,203);
		sue.setPenDown(true);
		
		sue.moveTo(250,237);
	}//end run method
}//end class Prob01Runner

