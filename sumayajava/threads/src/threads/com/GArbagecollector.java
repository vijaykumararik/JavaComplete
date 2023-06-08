package threads.com;

public class GArbagecollector {
public void finalize() {
		System.out.println("hii");
	}
public static void gc() {
	System.out.println("hi");
}
public static void main(String[] args) {
	GArbagecollector g=new GArbagecollector();
	g=null;
	g.gc();
       System.gc();
}
}
