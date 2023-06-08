package day2;

import java.util.Collections;
import java.util.LinkedList;

public class Demo {
public static void main(String[] args) {
	 
	LinkedList li= new LinkedList<>();
	li.add(30);
	li.add(62);
	li.add(52);
	li.add(36);
	li.add(41);
	System.out.println(li);
	Collections.sort(li);
	System.out.println(li);
}
}
