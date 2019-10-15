import java.util.*;
public class TreeMap1 {
	public static void main(String args[]) {
		TreeMap<Integer,String> map = new TreeMap<>();
		map.put(1, "isha");
		map.put(2,"appu");
		map.put(3, "harsh");
		
		map.forEach((k,v) -> System.out.println("Key = "
                + k + ", Value = " + v)); 
		
	}

}
