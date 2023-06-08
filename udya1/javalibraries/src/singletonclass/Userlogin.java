package singletonclass;

public class Userlogin {
  public static void main(String[] args) {
	

	Amazonaccount m=Amazonaccount.myAccount();
	System.out.println("user id "+ m.userid);
	Amazonaccount.myAccount();
	Amazonaccount.myAccount();
	Amazonaccount.myAccount();
  }	
}
