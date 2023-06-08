package com.collection;

import java.util.ArrayList;

public class Arraylist11 {
public static void main(String[] args) {
	ArrayList <> a=new ArrayList(20);
	a.add(10);
	a.add("java");
	a.add("hello my friend");
	a.add(20.3);
	a.add(85);
	a.add(15, 456);
	System.err.println(a);
	System.out.println(a);
	for (int i = 0; i < a.size(); i++) {
		System.out.println(a.get(i));
	}
	System.out.println("+++++++++++");
	for (Object o : a) {
		System.out.println(o);
	}
	ArrayList a2=new ArrayList<>(a);
	a2.add("viji");
	a2.add("nanu");
	a2.add('c');
	a2.add(a2);
	System.out.println(a2);
	a2.remove(3);
	System.out.println(a2);
	a2.removeAll(a);
	System.out.println(a2.clone());
	
	System.out.println(a2);
	System.err.println(a2.isEmpty());
	System.err.println(a2.isEmpty());
	System.out.println(a2);
	a2.add(4, 365);
	a2.addAll(a);
	a2.set(03,"i did");
	a2.add(1, a);
	System.out.println(a2);
//	System.out.println(a2.get(10));
	
	
}
}
