package day1;
import java.util.ArrayList;
public class Arraylist1 {
public static void main(String[] args) {
	ArrayList l=new ArrayList();
	/*ArryList is predefined class in java,util pakage we 
	 * need to import that */
	 System.out.println(l);
	//add()	method used to add elements to arraylist
      l.add(10);
	 l.add("java");
	 l.add("hello");
	 l.add(29.34);
	 l.add(10);
	 System.out.println(l);
	 System.out.println("size of arrylist "+l.size());
	 
	 System.out.println(l.get(4));
	 System.out.println(l.contains("hello"));
	 System.out.println(l);    //arraylist implements list,cloneable                                                 
	 l.remove(3);               //random acess,serializable
	 System.out.println(l);
	 System.out.println(l.isEmpty());
	 l.clear();
	 System.out.println(l.isEmpty());
	 l.add(20);
	 l.add(30);
	 l.add(23);
	 l.add(30);
	 System.out.println(l.indexOf(30));
	 System.out.println(l.lastIndexOf(30));
	
}
}
