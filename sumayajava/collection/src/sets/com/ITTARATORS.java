package sets.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ITTARATORS {
public static void main(String[] args) {
	Set<Object> s=new LinkedHashSet<Object>();
	s.add(12);
	s.add(23.56);
	s.add("hello java");
	s.add(null);
	Iterator<Object>r=s.iterator();
	while(r.hasNext()) {
		System.out.println(r.next());
	}
}
}
