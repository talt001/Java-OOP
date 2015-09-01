import java.util.*;

class Proj12Runner {
	
	
	public Proj12Runner(){
		
		System.out.println("Charles Combs");
		
	}
	
	public Collection<String> getCollection(){
		
		Collection collection = new TreeSet(new Proj12Comparator());
		
		return collection;
		
		//System.out.println();
		
	}
	
}