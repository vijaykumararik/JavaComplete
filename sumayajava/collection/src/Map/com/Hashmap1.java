package Map.com;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Hashmap1 {
	public static void main(String[] args) {
		LinkedHashMap<Object, Object> h=new LinkedHashMap<>();
		h.put(1, "vijay");
		h.put(null, null);
		h.put("hello", "kikik");
		h.put(12, 12);
		h.put(13, 12);
		System.out.println(h);
		System.out.println(h.get(12));
		System.out.println();
	}
}
