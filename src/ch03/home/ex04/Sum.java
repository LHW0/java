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

/* �� �ڿ����� �Է� �޾� �� �հ踦 ����϶�
ex)
a: 1
b: 2
1 + 2 = 3
*/