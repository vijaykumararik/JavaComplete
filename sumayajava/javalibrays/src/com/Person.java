package com;

public class Person {
  int eID;
  String eName;
  double eSalary;
	Person( int eId ,String eName,double eSalary)
	{
		this.eID=eId;
		this.eName=eName;
		this.eSalary=eSalary;
	}
	public String toString()
	{
		return "Employee id:"+eID+" name: "+eName+" salary:"+eSalary;
	}
}
