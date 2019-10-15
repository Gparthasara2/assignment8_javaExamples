import java.util.*;
public class TreeMap6 {
	public static void main(String args[]) {
		TreeMap<Integer,String> map = new TreeMap<>();
		map.put(1, "one");
	    map.put(2, "two");
	    map.put(3, "three");
	    map.put(4,"four");
	    map.put(5,"five");
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a key");
	    int k= sc.nextInt();
	    System.out.println("Map with key less than "+k+"\n "+map.headMap(k));
	    
	}

}
