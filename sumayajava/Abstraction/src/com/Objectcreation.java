package com;

public class Objectcreation {
 
	User create(int choise,int password)
	{
		if(choise==1&&password==1234)
		{
			User c=new Customer();
			return c;
		}
		else if(choise==2&&password==4321)
		{
			User a=new Admin();
			return a;
		}else
		{
			return null;
		}
	}
}
