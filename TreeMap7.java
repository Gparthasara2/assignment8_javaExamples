import java.util.*;
public class TreeMap7 {
	public static void main(String args[]) {
		TreeMap<Integer,String> map = new TreeMap<>();
		SortedMap<Integer,String> submap = new TreeMap<>();
		map.put(1, "one");
	    map.put(2, "two");
	    map.put(3, "three");
	    map.put(4,"four");
	    map.put(5,"five");
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a start and end key to create a sub map[1-5]");
	    int s = sc.nextInt();
	    int e = sc.nextInt();
	    submap = map.subMap(s,e);
	    System.out.println(submap);
	}

}
