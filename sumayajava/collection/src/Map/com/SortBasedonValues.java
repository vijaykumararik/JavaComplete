package Map.com;

//Program to sort key and value
import java.util.*;
import java.util.Map.Entry;

public class SortBasedonValues {

  public static void main(String[] args) {

      HashMap<String, Integer> hm = new HashMap<String, Integer>();
      hm.put("Java", 2);
      hm.put("Sql", 3);
      hm.put("Html", 4);
      hm.put("ReactJs", 1);
      Set<Entry<String, Integer>> set = hm.entrySet();
      List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
      Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() 
      {
          public int compare(Map.Entry<String, Integer> o1,Map.Entry<String, Integer> o2) 
          {
             // return o1.getKey().compareTo(o2.getKey());//to sort key
               return o1.getValue().compareTo(o2.getValue());//to sort value
          }
         
      });

      for (Entry<String, Integer> entry : list) 
      {
          //System.out.println(entry.getKey());
          System.out.println(entry.getValue());
          

      }

  }
}
