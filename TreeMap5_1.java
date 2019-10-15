import java.util.*;
//  https://beginnersbook.com/2014/07/how-to-iterate-treemap-in-reverse-order-in-java/
class TreeMap5_1 {
  public static void main(String args[]) {
 
    Map<String, String> treemap = 
      new TreeMap<String, String>(Collections.reverseOrder());

    // Put elements to the map
    treemap.put("Key1", "Jack");
    treemap.put("Key2", "Rick");
    treemap.put("Key3", "Kate");
    treemap.put("Key40", "Tom");
    treemap.put("Key5", "Steve");
 
    Set set = treemap.entrySet();
    Iterator i = set.iterator();
    // Display elements
    while(i.hasNext()) {
      Map.Entry me = (Map.Entry)i.next();
      System.out.print(me.getKey() + ": ");
      System.out.println(me.getValue());
    }
  }
}

