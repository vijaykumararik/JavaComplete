package com;

 class Solution {

	public static void main(String[] args) {
       
		Employee e1 =new Employee();
		Employee e2 =new Employee();
		Employee e3=new Employee();
		e1.id=11;e2.id=12;e3.id=13;
		e1.name=333;e2.name=444;e3.name=666;
		e1.salary=12000.23;e2.salary=1111.90;e3.salary=24567.56;
		
		System.out.println(e1.name+" had id "+e1.id+"and salary is "+e1.salary );
		System.out.println(e2.name+" had id "+e2.id+"and salary is "+e2.salary );

		System.out.println(e3.name+" had id "+e3.id+"and salary is "+e3.salary );

		
	}

}
