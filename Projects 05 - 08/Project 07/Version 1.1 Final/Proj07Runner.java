//Charles Combs for ITSE 2321 section 008 Prof. Baldwin

import java.util.*;

public class Proj07Runner extends Proj07{
	private int data;

	public Proj07Runner(int inData){//constructor

	   System.out.println("Proj07");

	   System.out.println("Charles");

	    data = inData;

	  }//end constructor


	  public int getData(){//abstract method

	    return (data / 2);//this right here
	  }//end concrete version getData


	  public String toString(){//method

	    return "Combs";

	  }//end toString() override

}//end class Prob04MyClass
