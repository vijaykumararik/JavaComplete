package overriding;

public class Son extends Farent {
    @Override
	public void display()
	{  super.display();
		System.out.println("hello iam display in son");
	}
    @Override
	public void test()
	{   super.test();
		System.out.println("iam test in son class");
	}
     
    public static void show()
    { 
    	System.out.println("show in son ");
    }
}
