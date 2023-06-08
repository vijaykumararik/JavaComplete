package defalutsorting;

public class Student implements Comparable<Student> {

	int id;
	String name;
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public String toString()
	{
		return ""+id+" "+name;
	}

	@Override
	public int compareTo(Student s) {
		
		return this.name.compareTo(s.name);
	}
//comparing with name by using compareto	
}
