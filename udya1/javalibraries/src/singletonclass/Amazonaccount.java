package singletonclass;

public class Amazonaccount {
    String userid="vijay@Arik";
	private static Amazonaccount a;
    private Amazonaccount()
	{
		System.out.println("you created Amazon account");
		System.out.println("with user id "+userid);
	}
	public static Amazonaccount myAccount()
	{
		if(a==null)
		{
			a=new Amazonaccount();
		}
		else {
			System.out.println("your allready have an account");
		}
		return a;
	}
	
}
