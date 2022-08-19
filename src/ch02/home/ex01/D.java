package ch02.home.ex01;

public class D {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		System.out.printf("%d, %d\n", a, b);
		
		a = b;
		System.out.printf("%d, %d\n", a, b);
		
		a = b= 2;
		System.out.printf("%d, %d\n", a, b);
		
		double d = Math.random();
		System.out.printf("%.2f",d);
				
	}
}
