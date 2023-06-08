package day5;

import java.util.HashSet;

public class HAshset {
public static void main(String[] args) {
	HashSet h=new HashSet<>();
	h.add(23);
	h.add(29.45);
	h.add(23);//dublicates are not allowed in hashset and insertion order allso 
	          //not maintained and not index based
	h.add("java");
	h.add(null);
	System.out.println(h);
	System.out.println(h.size());
}
}
