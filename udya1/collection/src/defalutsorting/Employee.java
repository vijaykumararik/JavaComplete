package defalutsorting;

public class Employee implements Comparable<Employee> {
    int id;
    String name;
    Double salary;
	public Employee(int id ,String name, Double salary)
  {
	  this.id=id;
	  this.name=name;
	  this.salary=salary;
  }
	@Override
	public String toString()
	{
		return id+" "+name+" "+salary;
	}
//	@Override
//	public int compareTo(Employee e)
//	{
//		return this.id-e.id;
//	}
	@Override
	public int  compareTo(Employee e)
	{
		return (this.salary.compareTo(e.salary));
	}
//	@Override
//	public int compareTo(Employee e) {
//		
//		return this.name.compareTo(e.name);
//	}
	
}
