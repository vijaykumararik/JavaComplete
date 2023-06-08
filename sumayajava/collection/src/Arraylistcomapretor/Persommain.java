package Arraylistcomapretor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Student{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
class Sortid implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		return s1.id-s2.id;
	}
	
}
public class Persommain {
public static void main(String[] args) {
	
	Sortid e1 =new Sortid();
	ArrayList a1=new ArrayList<>();
	Student s1=new Student(102,"abc");
	Student s2=new Student(101,"xtabc");
	Student s3=new Student(3,"tyabc");
	Student s4=new Student(213,"edabc");
	a1.add(s1);
	a1.add(s2);a1.add(s3);a1.add(s4);
	Collections.sort(a1,e1);
	System.out.println(a1);
}
}
