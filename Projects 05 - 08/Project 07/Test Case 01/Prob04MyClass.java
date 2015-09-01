
class Prob04MyClass extends Prob04{
	  private int data;

	  public Prob04MyClass(int inData){//constructor
	    System.out.println("Prob04");
	    System.out.println("Dick");
	    data = inData;
	  }//end constructor

	  public int getData(){//overridden abstract method
	    return data;
	  }//end getData()

	  public String toString(){//overridden method
	    return "Baldwin";
	  }//end overloaded toString()

	}//end class Prob04MyClass
