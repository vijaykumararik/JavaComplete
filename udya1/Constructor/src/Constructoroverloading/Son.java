package Constructoroverloading;

public class Son extends Father {
 
	public Son() {
		super(253);

		System.out.println("hello my son");
	}
	Son(double d)
	{
		System.out.println("value is "+d);
	}
	

}
