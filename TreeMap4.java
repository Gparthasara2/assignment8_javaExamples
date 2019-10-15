import java.util.*;
public class TreeMap4 {
	public static void main(String args[]) {
    TreeMap<Integer,String> map = new TreeMap<>();
    map.put(1, "one");
    map.put(2, "two");
    map.put(3, "three");
    map.put(4,"four");
    map.put(5, "five");
    
    Map.Entry<Integer,String> entry = map.entrySet().iterator().next();
    int LKey = entry.getKey();
    String LVal = entry.getValue();
    int SKey = entry.getKey();
    String SVal = entry.getValue();
    
    for (Map.Entry<Integer, String> map1 : map.entrySet()) {
	    int key = map1.getKey();
	    if (key > LKey) {
		LKey = key;
		LVal = map1.getValue();
	    }
	    else{
			SKey = key;
			SVal = map1.getValue();
		    }
	}
    
	System.out.println("Largest Key       : " + LKey);
	System.out.println("Largest Key Value : " + LVal);
	System.out.println("Smallest Key       : " + SKey);
	System.out.println("Smallest Key Value : " + SVal);
    
    
	}
}
