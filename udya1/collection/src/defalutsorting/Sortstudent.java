package defalutsorting;

import java.util.TreeSet;

public class Sortstudent {
public static void main(String[] args) {
	
	Student s1=new Student(121, "vijat");
	Student s2=new Student(122, "aijat");
	Student s3=new Student(120, "uijat");
	TreeSet<Student> t=new TreeSet<Student>();
	t.add(s1);
	t.add(s2);
	t.add(s3);
	for (Student s : t) {
		System.out.println(s);
	}
}
}
