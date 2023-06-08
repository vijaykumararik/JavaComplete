package threads.com;
class Testthread
{
	synchronized void div(int n)
	{
		for (int i = 1; i <=5; i++) {
			System.err.println(n/i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
class Thread1 extends Thread
{
	Testthread t;
	Thread1(Testthread t){
		this.t=t;
	}
	public void run()
	{
		t.div(100);
	}
	
}
class Thread2 extends Thread
{
	Testthread t;
	Thread2(Testthread t){
		this.t=t;
	}
	public void run()
	{
		t.div(50);
	}
}
public class Threadracing {
	
public static void main(String[] args) {
	Testthread t=new Testthread();
	Thread1 t1=new Thread1(t);
	t1.start();
	Thread2 t2=new Thread2(t);
	t2.start();
	
}
}
