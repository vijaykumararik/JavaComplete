package day5;

public class Comparetomethod {
public static void main(String[] args) {
	String s1="A";
	String s2="B";
	System.out.println(s1.compareTo(s2));
	System.out.println(s2.compareTo(s1));
	System.out.println(s2.compareTo(s2));
	System.out.println("+++++++++++++++=");
	Integer a=20;
	Integer b=30;
	System.out.println(a.compareTo(b));
	System.out.println(b.compareTo(a));
	System.out.println(b.compareTo(b));
}
}
