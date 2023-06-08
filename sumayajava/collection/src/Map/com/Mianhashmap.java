package Map.com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

class Employee
{
	int id;
	String name;
	public Employee(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class Mianhashmap {

	public static void main(String[] args) {
		Employee e1 = new Employee(101,"abc");
		Employee e2 = new Employee(102,"Def");
		HashMap<Integer,String> h1 = new HashMap<Integer,String>();
		h1.put(e1.getId(), e1.getName());
		h1.put(e2.getId(), e2.getName());
		System.out.println(h1);
		System.out.println("----------------------");
		TreeMap<Integer,String> t1 = new TreeMap<Integer,String>();
		e1.setId(103);
		e1.setName("ghi");
		e2.setId(104);
		e2.setName("jkl");
		t1.put(e1.getId(), e1.getName());
		t1.put(e2.getId(), e2.getName());
		System.out.println(t1);
		System.out.println("----------------------");
		LinkedHashMap<Integer,String> l1 = new LinkedHashMap<Integer,String>();
		e1.setId(105);
		e1.setName("xyz");
		e2.setId(106);
		e2.setName("lmn");
		l1.put(e1.getId(), e1.getName());
		l1.put(e2.getId(), e2.getName());
		System.out.println(l1);
	}

}