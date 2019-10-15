import java.util.*;
public class TreeMap2 {
	public static void main(String[] args) {
		TreeMap<Integer,String> map1 = new TreeMap<>();
		TreeMap<Integer,String> map2 = new TreeMap<>();
		map1.put(1, "isha");
		map1.put(2,"appu");
		map1.put(3, "harsh");
		System.out.println("map1"+map1);
		map2.put(1, "Liya");
		map2.put(2,"elaneor");
		map2.put(3, "vaani");
		System.out.println("map2"+map2);
		map1.putAll(map2);//copying map2 to map1
		System.out.println("map1"+map1);
		
		
	}
}
