package threads.com;

public class ThreadDeadLock {
	public static void main(String[] args) {
		String str = new String("hi");
		String str2 = new String("hii");
		T1 t1 = new T1(str,str2);
		T2 t2 = new T2(str,str2);
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		th1.start();
		th2.start();
	}
}
class T1 implements Runnable
{
	String s1 = null;
	String s2 = null;
	public T1(String s1, String s2)
	{
		this.s1 = s1;
		this.s2 = s2;
	}
	@Override
	public void run()
	{
		System.out.println("t1 waiting to lock s1");
		synchronized(s1)//synchronized block
		{
			System.out.println("t1 locked s1");
			System.out.println("t1 waiting to lock s2");
			try{
				System.out.println("t1 pause");
				s1.wait();
				System.out.println("t1 resume");
			}
			catch(InterruptedException e)
			{
				System.out.println("hello...");
			}
			synchronized(s2)
			{
				s1.notify();
			System.out.println("t1 locked s2");
			}
			System.out.println("t1 unlock s1");
			System.out.println("t1 unlock s2");
		}
	}
}
class T2 implements Runnable
{
	String s1 = null;
	String s2 = null;
	public T2(String s1, String s2)
	{
		this.s1 = s1;
		this.s2 = s2;
	}
	@Override
	public void run()
	{
		System.out.println("t1 waiting to lock s2");
		synchronized(s2)
		{
			System.out.println("t2 locked s2");
			System.out.println("t2 waiting to lock s1");
			synchronized(s1)
			{
			System.out.println("t2 locked s1");
			s1.notify();
			}
			System.out.println("t2 unlock s2");
			System.out.println("t2 unlock s1");
		}
	}
}
