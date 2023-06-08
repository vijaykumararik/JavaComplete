package com;

import java.util.Objects;

class Employee {
	int a = 1;

	@Override
	public int hashCode() {
		return Objects.hash(a);
	}

	@Override
	public boolean equals(Object obj) {

		return obj == obj;
	}

	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println(obj.hashCode());
		int s = obj.hashCode();
		System.out.println();
	}
}
