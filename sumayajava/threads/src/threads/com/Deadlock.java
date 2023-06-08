package threads.com;
class TotalEarning extends Thread
{
	int total=0;
	public void run() {
		synchronized (this) {
			for (int i = 0; i <=10; i++) {
			total=total+100;
			}
			this.notify();
		}
	}
}
public class Deadlock {
public static void main(String[] args) {
	TotalEarning te=new TotalEarning();
	te.start();
	
	synchronized (te) {
		try {
			te.wait(1000);
		} catch (Exception e) {
		System.out.println("invalid");	
		}
	}
	System.out.println("total: "+te.total +"rs");
	
}
}
