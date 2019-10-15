import java.util.*;
public class Main {
	
	List<String> s_List = new ArrayList<String>();
	List<String> s_List1 = new ArrayList<String>();
	public static void main(String args[]) {
	Scanner sc  = new Scanner(System.in);	
	Main m = new Main();
	
	int f=1;
	m.s_List.add("yellow");
	m.s_List.add("red");
	m.s_List.add("green");
	m.s_List.add("blue");
	
	
	

	do {
		System.out.println("M E N U");
		System.out.println("1.Add\n2.Retrieve\n3.Serach\n4.Sort\n5.Shuffle\n6.Reverse\n7.Iterate from Specified Index");
		System.out.println("Enter a valid option");
		int option=Integer.parseInt(sc.nextLine());
		switch(option) {
		case 1:
			m.add();
			break;
		case 2:
			m.retrieve();
			break;
		case 3:
			m.search();
			break;
		case 4:
			m.sort();
			break;
		case 5:
			m.shuffle();
			break;
		case 6:
			m.reverse();
			break;
		case 7:
			m.compare();
			break;
		case 8:
			m.view();
			break;
		case 9:
			f=0;
			break;
		default:
			System.out.println("Enter a valid option");
			break;
		
//			m.iterateIndex();
//			
//			m.iterateDescending();
//			
		}
		
	}while(f!=0);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	public void view() {
		System.out.println(s_List);
	}
	public void compare() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number elements to add in list");
		int n= Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
			s_List1.add(sc.nextLine());
		}
		 boolean isEqual = s_List.equals(s_List1);      //false
	        System.out.println(isEqual);
	}
	
	
	public void iterateDescending() {
//		Iterator i = s_List.descendingIterator();
//		Iterator j = s_List.
		
	}
	
	public void iterateIndex() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter index to iterate");
		int ind= Integer.parseInt(sc.nextLine());
		Iterator i = s_List.listIterator(ind);
		while (i.hasNext()) {
			   System.out.println(i.next());
		}
			   
	}
	
	public void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to be appended to the list");
		String str1 = sc.nextLine();
		this.s_List.add(str1);
		System.out.println("list"+s_List);
	}
	
	public void reverse() {
		Collections.reverse(s_List);
		System.out.println("After Reversing "+s_List);
	}
	
	public void shuffle() {
		Collections.shuffle(s_List);
		System.out.println("After Shuffling "+s_List);
	}
	
	public void sort() {
		Collections.sort(s_List);
		System.out.println("After Sorting "+s_List);
	}
	
	public void search() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter search element");
		String str = sc.nextLine();
		if(s_List.contains(str)) {
			System.out.println("Element is present in the list");
		}
		else {
			System.out.println("Element is not present in the list");
		}
	}
	
	public void retrieve() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter index to retrieve");
		int r = Integer.parseInt(sc.nextLine());
		System.out.println(s_List.get(r));
	}
}