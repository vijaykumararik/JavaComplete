package org;

public class Saving implements Account {
   
	double bal;
	Saving(double bal)
	{
		this.bal=bal;
	}
	@Override
	public void withdraw(double amt) {
		bal=bal-amt;
		System.out.println(amt+" amount is withdrown");	
	}@Override
	public void deposit(double amt) {
		bal=bal+amt;
		System.out.println(amt+" amount deposited");
		
	}
	@Override
	public void checkBalence() {
		System.out.println("your account balence is "+bal);
		
	}

}
