


package singletonclass;

public class Account {
	String s="vijay";
  private static Account obj=null;
	 private Account(){
		System.out.println("object created");
	}
	 public static Account createobject()
	 {
		 if(obj==null) {
			 obj=new Account();
		 }
		 else
		 {
			 System.out.println("cannot create object");
		 }
		 return obj;
	 }
}
