package org;

public class Test {
 
	Drink moring(int choise )
	{
		if(choise==1)
		{
			Coffe c=new Coffe();
			return c;
		} else if(choise==2){
			Tea t=new Tea();
			return t;
		}else {
			return null;
		}
			
	}
}
