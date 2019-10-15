import java.util.*;
public class Main {
	LinkedList<String> list = new LinkedList<>();
	public static void main(String[] args) {
		Main m = new Main();
		m.list.add("1");
		m.list.add("2");
		m.list.add("3");
		m.list.add("4");
		m.list.add("5");
		int f=1;
		do {
			Scanner sc =new Scanner(System.in);
			System.out.println("MENU");
			System.out.println("1.Append \n 2.View\n3.Iterate from Specified Index\n4.Iterate in Descending order \n5.Print first and Last Element\n6.Retrieve an element\n7.Retrieve and Remove an element\n8.Convert to Array List\n9.EXIT");
			System.out.println("Enter a valid option");
			int option=Integer.parseInt(sc.nextLine());
			switch(option) {
			case 1:
				m.append();
				break;
			case 2:m.view();break;
			case 3:m.iterateIndex();
			break;
			case 4:m.iterateDescending();
				break;
			case 5:m.first_lastElement();
				break;
			case 6:
				m.retrieve_notRemove();break;
			case 7:m.remove_retrieveFirstElement();break;
			case 8:m.arrayList();break;
			case 9:f=0;break;
			
			
			}
		}while(f!=0);
		
	}
	
	public void append() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to append");
		String str=sc.nextLine();
		this.list.add(str);
	}
	public void view() {
		System.out.println(list);
	}
	public void iterateIndex() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter index to iterate");
		int ind= Integer.parseInt(sc.nextLine());
		Iterator i = list.listIterator(ind);
		while (i.hasNext()) {
			   System.out.println(i.next());
		}
	}
	public void iterateDescending() {
		Iterator i = list.descendingIterator();
		while (i.hasNext()) {
			   System.out.println(i.next());
		}
	}
	public void first_lastElement() {
		Object first_element = list.getFirst();
	    System.out.println("First Element is: "+first_element);
	 
	    
	    Object last_element = list.getLast();
	    System.out.println("Last Element is: "+last_element);
	}
	public void retrieve_notRemove() {
		String x = list.peekLast();
	    System.out.println("Last element in the list: " + x);
	    System.out.println("Linked list after retrieve operation: "+list);
	}
	public void remove_retrieveFirstElement() {
		System.out.println("Original linked  list: " + list);
        
	     System.out.println("Removed element: "+list.pop());
	     
	     System.out.println("Linked list after pop operation: "+list);
	}
	public void arrayList() {
		List<String> arraylist = new ArrayList<String>(list);
		 for (String str : arraylist){
		      System.out.println(str);
		    }
	}
}
