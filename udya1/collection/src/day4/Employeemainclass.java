package day4;

import java.util.ArrayList;

public class Employeemainclass {
public static void main(String[] args) {
//to Store the objects inside the Array list
	Employee e1=new Employee(121, "vijay");
	Employee e2=new Employee(123, "ajay");
	ArrayList<Employee> l=new ArrayList<Employee>();
	l.add(e1);
	l.add(e2);
	l.add(new Employee(124, "shsha"));
	l.add(new Employee(145, "hello"));
	System.out.println(l);
	//if we dont override the the to string method we get fullyQualifed address
	//of the object
	for (Employee emp : l) {
		System.out.println(emp);
		
	}
}
}
