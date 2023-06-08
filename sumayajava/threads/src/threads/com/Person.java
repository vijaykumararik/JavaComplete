package threads.com;

public class Person  implements Runnable{
	int a=10;
	public void run() {
		for (int i = 0; i < 6; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
	}
public static void main(String[] args) {
	Person p=new Person();
	Thread th=new Thread(p);
 System.out.println(p.a);
	th.start();
//	p.run();
	th.currentThread();
	System.out.println(th);
	
	
}
}
