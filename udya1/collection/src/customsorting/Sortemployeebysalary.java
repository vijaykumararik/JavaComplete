package customsorting;

import java.util.Comparator;

public class Sortemployeebysalary implements Comparator<Employee>{
    @Override
	public int compare(Employee x,Employee y)
	{
		return x.salary.compareTo(y.salary);
	}
}
