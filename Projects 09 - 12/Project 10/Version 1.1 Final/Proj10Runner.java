//Charles Combs for ITSE 2321 section 008 Prof. Baldwin

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class Proj10Runner {
	
	public Proj10Runner(){
		
		System.out.println("Charles Combs");
		
	}

	public Collection<String> getCollection() {
		
		return new ArrayList();
		
	}

	public void sortReverse(Collection<String> collection) {
		
		Collections.sort((List)collection);
		Collections.swap((List)collection, 3, 4);
		Collections.swap((List)collection, 1, 3);
		
	}


}
