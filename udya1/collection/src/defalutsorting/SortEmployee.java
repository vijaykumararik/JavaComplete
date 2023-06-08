package defalutsorting;

import java.util.TreeSet;

public class SortEmployee {

	public static void main(String[] args) {
		 
		Employee e1=new Employee(121, "vijay", 40.25);
		Employee e2=new Employee(125, "aijay", 40.75);
		Employee e3=new Employee(126, "kijay", 41.25);
		TreeSet<Employee> t=new TreeSet<>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(new Employee(128, "majat", 45.45));
		t.add(new Employee(129, "wuaya", 40.81));
		for(Employee e:t)
		{
			System.out.println(e);
		}
	}
}
