//Charles Combs for ITSE 2321 section 008 Prof. Baldwin

import java.io.Serializable;
import java.util.*;

class Proj12Comparator implements Comparator, Serializable{

	public int compare(Object o1, Object o2){
		
		if(!(o1 instanceof String)){
			throw new ClassCastException();
		}
		
		if(!(o2 instanceof String)){
			throw new ClassCastException();
		}

		
		int result = ((String)o1).toUpperCase().compareTo(((String)o2).toUpperCase());
			
		return result;
		
		
	}//end compare()

		
}//end class Proj12Comparator