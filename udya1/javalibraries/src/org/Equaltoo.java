package org;

public class Equaltoo {
	int id;

	public Equaltoo(int id) {
		this.id = id;
	}
	public boolean equals(Object obj)
	{
		Equaltoo eq= (Equaltoo) obj;
		return this.id==eq.id;
	}

	public static void main(String[] args) {
		Equaltoo e1 = new Equaltoo(123);
		Equaltoo e2 = new Equaltoo(183);
		Equaltoo e3 = new Equaltoo(123);
		Equaltoo e4 = new Equaltoo(153);
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));

	}
}
