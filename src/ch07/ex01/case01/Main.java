package ch07.ex01.case01;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		B b = c;
		A a = c; // promotion
		
		c = (C)a; // a -> C е╦ют casting
		
		c = (C)a;
		c = (C)b;
		
		b = (B)a;
		
		//String s = (String)C;
	}
}
