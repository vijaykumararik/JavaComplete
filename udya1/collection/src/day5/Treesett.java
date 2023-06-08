package day5;

import java.util.TreeSet;

public class Treesett {
public static void main(String[] args) {
	TreeSet t=new TreeSet();
	t.add(30);
	t.add(56);
	t.add(86);
	t.add(52);
	t.add(10);
	//sorting is done internally for treeset 
	System.out.println(t);
	System.out.println("==================");
	TreeSet t1=new TreeSet<>();
	t1.add("ajay");
	t1.add("bijay");
	t1.add("cijay");
	t1.add("xjat");
	t1.add("mjay");
	t1.add("dijay");
	System.out.println(t1);
	for(Object i:t1)
	{
		System.out.println(i);
		
	}
	
}
}
