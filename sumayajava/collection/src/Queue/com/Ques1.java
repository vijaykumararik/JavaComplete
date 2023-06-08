package Queue.com;

import java.util.PriorityQueue;

public class Ques1 {
public static void main(String[] args) {
	PriorityQueue p=new PriorityQueue<>();
	p.add(12);
	p.add(90);
	p.add(65);
	p.add(89);
	System.out.println(p);
	System.out.println(p.poll());
	System.out.println(p);
	System.out.println(p.poll());
	System.out.println(p);
	System.out.println(p.poll());
	System.out.println(p);
	System.out.println(p.poll());
}
}
