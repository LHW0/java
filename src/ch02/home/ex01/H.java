package ch02.home.ex01;

import java.util.Scanner;

public class H {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("a: "); 
		int a = sc.nextInt();
		System.out.print("b: ");
		int b = sc.nextInt();
		System.out.printf("=> a: %d, b: %d\n",a, b);
		System.out.println("=> a, b ���� ��ü�մϴ�.");
		
		int temp = 0; 
		temp = a;
		a = b;
		b= temp;
		System.out.printf("=> a: %d, b: %d\n", a, b);
	}
}