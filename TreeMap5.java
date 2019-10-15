import java.util.*;
public class TreeMap5 {
	public static void main(String args[]) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(1, "one");
	    map.put(2, "two");
	    map.put(30, "three");
	    map.put(4,"four");
	    map.put(5, "five");
	    System.out.println("Orginal order:"+map);
	    System.out.println("Reverse order:"+map.descendingMap());
	}
}
