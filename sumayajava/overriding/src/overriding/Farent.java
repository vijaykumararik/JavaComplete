package overriding;

public class Farent {

	public void test()
	{
		System.out.println("hello iam in farent class");
	}
	public void display()
	{
		System.out.println("iam display in farent class");
	}
	public static void show()//this methos is hidden it is possible to access only
	{                         //creating object of super class only
		System.out.println("show values in farent");
	}
}
