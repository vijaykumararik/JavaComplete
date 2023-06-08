package com;

public class Test {
	
	Electronics shoping(int choise)
	{
		if(choise==1) {
			Laptop l=new Laptop();
					return l;
		}
		else if(choise==2) {
			Mobiles m=new Mobiles();
					return m; 
		}
		else
		{
			return null;
		}
	}
//if we create object of laptop it get 	properties of laptop and electronics that why e is
//instance of object laptop similarly for mobile allso

}
