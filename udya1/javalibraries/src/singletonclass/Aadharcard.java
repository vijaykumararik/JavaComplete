package singletonclass;

public class Aadharcard {
  //to cheack the object is null or not we delcaring this non premitive variable 
	//and making it as private so not possible to access outside class
	//and static becouse we need to access in side the the static method
	private static Aadharcard a=null;
	//if we made constructor as private it is not possible to
	//access out side the class
	private  Aadharcard() {
		System.out.println("Adharcard object created");
		
	}
	public static void createObject()
	{   if(a==null) {//if it is null only it will create otherwise no
		 a=new Aadharcard();
	}
	else {
		System.out.println("object is allready created");
	}
		
	}
}
