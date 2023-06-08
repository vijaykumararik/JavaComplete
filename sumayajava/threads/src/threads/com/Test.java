package threads.com;

public class Test  {
	
public static void main(String[] args) {
	System.out.println("program starts.....");
	Runnable ref=()->//syntex to interface in thread.
	{
		for (int i = 0; i <=5; i++) {
			System.out.println("run: "+i);
		}
	};
	ref.run();
	//runable interface 
	Runnable ref1=()->
	{
		for (int i = 0; i <=5; i++) {
			System.out.println("run : "+i);
		}
		for(int j=2;j<=5;j++) {
			System.out.println("run: "+j);
		}
	};
	ref1.run();
	for (int i = 0; i <=5; i++) {
		System.out.println("main :"+i);
		System.out.println("program ends......");
	}
	
	
		
	
}
}
