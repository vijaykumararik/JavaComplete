package day2;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedArraylist1 {
 public static void main(String[] args) {
	
	 LinkedList li=new LinkedList<>();
	 li.add(20);
	 li.add(30);
	 li.add(32);
	 li.add(50);
	 System.out.println(li);
	 for (int i = 0; i <li.size(); i++) {
		System.out.println(li.get(i));
	}
	   ArrayList al=new ArrayList() ;
			   al.add(91);
			   al.add(96);
			   al.add(95);
			   System.out.println(al);
			   System.out.println("============");
			   li.addAll(al);
			   System.out.println(li);
			   System.out.println(li.containsAll(al));
			   
			   li.removeAll(al);
			   System.out.println(li);
			   System.out.println("============");
			   li.add(1,60);
			   System.out.println(li);
			   li.set(2,70);
			   System.out.println(li);
			   
			   
	 
}
}
