package ch03.home.ex04;

import java.util.Scanner;

public class Sum {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a: "); 
		int a = sc.nextInt();
		System.out.println("b: "); 
		int b = sc.nextInt();
		
		int c = a+b;
		System.out.printf("%d + %d = %d", a,b,c);
		
		
		/*int a = 0;
		int b = 0;
		
		System.out.println("a: ");
		a = sc.nextInt();
		System.out.println("b: ");
		b = sc.nextInt();
	
		System.out.printf("%d + %d = %d", a, b, a+b);
		
				*/
	}
	
}

/* 두 자연수를 입력 받아 그 합계를 출력하라
ex)
a: 1
b: 2
1 + 2 = 3
*/