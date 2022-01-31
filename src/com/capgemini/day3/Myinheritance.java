package com.capgemini.day3;
class A{
	public int a=10;
	A()
	{
		System.out.println("I am class a");
	}
}
class B extends A{
	public int b=20;
	B()
	{
		System.out.println("I am class b");
	}
}
public class Myinheritance {
	public static void main(String args[]) {
		A a=new A();
		B b=new B();
		System.out.println(b.a);
		System.out.println(b.b);
	}

}
