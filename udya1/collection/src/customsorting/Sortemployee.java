package customsorting;

import java.util.TreeSet;

public class Sortemployee {
public static void main(String[] args) {
	Employee e1=new Employee(101,"vijay",123.45);
	Employee e2=new Employee(103,"nijay",124.55);
	SortemployeebyID id=new SortemployeebyID();
	Sortemployeebyname name=new Sortemployeebyname();
	Sortemployeebysalary salary=new Sortemployeebysalary();
	
//	TreeSet<Employee> t=new TreeSet<Employee>(id);
//	TreeSet<Employee> t=new TreeSet<Employee>(name);
	TreeSet<Employee> t=new TreeSet<Employee>(salary); 
     t.add(e1);
     t.add(e2);
     t.add(new Employee(102, "ajay", 123.56));
     t.add(new Employee(105, "kjay", 120.56));
     for (Employee e : t) {
		System.out.println(e);
	}
}
}
