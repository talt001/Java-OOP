package proj05;

import java.io.Serializable;
import java.util.Comparator;

class Proj12Comparator implements Comparator,Serializable{

public int compare(Object o1,Object o2){
  if(!(o1 instanceof String))
      throw new ClassCastException();
  if(!(o2 instanceof String))
      throw new ClassCastException();

  //Do a comparison
  int result = ((String)o1).compareTo(((String)o2));
  return result*(-1);
}//end compare()
}//end class TheComparator