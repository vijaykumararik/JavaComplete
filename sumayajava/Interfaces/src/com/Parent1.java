package com;

public interface Parent1 {
  void display();
  void test();
  public static void show() {
	  System.out.println("hello showing ");
  }
  public default void run()
  {
	  System.out.println("runing in intrface");
  }
}
