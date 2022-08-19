package ch02.home.ex01;

import java.util.Scanner;

public class H02Replacement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
			// presentation logic
		System.out.print("a: "); 
		int a = sc.nextInt();
		System.out.print("b: ");
		int b = sc.nextInt();
		System.out.printf("=> a: %d, b: %d\n",a, b);
		System.out.println("=> a, b 값을 교체합니다.");
		
		
		int temp = 0; //business logic 확장성
		temp = a; // backup
		a = b;
		b= temp;
		System.out.printf("=> a: %d, b: %d\n", a, b);
	/*	public static void main(String [] args) {
			Random random = new Random();
			
			int a = random.nextInt();
			int b = random.nextInt();
			int temp = 0;
			temp = a;
			a = b;
			b = temp;
			
			System.out.println(a);
			System.out.println(b);
			*/
	}
}

