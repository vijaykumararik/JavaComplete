package day4;

import java.util.ArrayList;
import java.util.LinkedList;

public class Arraylistconstructor {

	
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(20);
		System.out.println(l);
		ArrayList l1=new ArrayList<>(50);
		l1.add(20);
		l1.add(30);
		System.out.println(l1);
		LinkedList x=new LinkedList<>();
		x.add(50);
		System.out.println(x);
		//adding another list into new list so that the list is added fully
		LinkedList y=new LinkedList<>(x);
		y.add(80);
		System.out.println(y);
		LinkedList z=new LinkedList<>(y);
		z.add(90);
		System.out.println(z);
	}
}
