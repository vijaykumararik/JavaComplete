package customsorting;

import java.util.Comparator;

public class SortemployeebyID implements Comparator<Employee>{

	@Override
	public int compare(Employee x, Employee y) {
		
		return x.id-y.id;
	}

}
