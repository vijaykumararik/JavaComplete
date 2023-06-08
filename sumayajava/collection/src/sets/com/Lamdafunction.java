package sets.com;

import java.util.HashSet;

public class Lamdafunction {
public static void main(String[] args) {
	HashSet<Object>h1=new HashSet<>();
	h1.add(234);
	h1.add("king");
	h1.add('e');
	h1.add(true);
	h1.forEach(obj-> {
		
	System.out.println(obj);
	System.out.println("hello");
	});
//	h1.forEach(null);
}
}
