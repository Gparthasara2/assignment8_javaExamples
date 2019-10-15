import java.util.*;
public class TreeMap3 {
	public static void main(String args[]) {
		TreeMap<Integer,String> map = new TreeMap<>();
		Scanner sc = new Scanner(System.in);
		map.put(1, "add");
		map.put(2,"sub");
		map.put(3, "mul");
		System.out.println("Enter a key to search");
		int val = sc.nextInt();
		if(map.containsKey(val)) {
			System.out.println("The map conatains the key");
		}
		else {
			System.out.println("The map doesn't conatains the key");
		}
	}
}
