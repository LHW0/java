package ch04.home.ex04;

import java.util.Scanner;

public class H02Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		int i = 1;
		int j = 1;
		int v = i + j;
		int b = i - j;
		int n = i * j;
		int m = i / j;
		String d = "";
		String f = "";
		boolean why = false;
		do {
			if(d == "+" || d == "-" || d == "*" || d == "/") why = true; 
			System.out.print("a: ");
			i = sc.nextInt();
			sc.nextLine();
			System.out.print("op: ");
			d = sc.nextLine();
			System.out.print("b: ");
			j = sc.nextInt();
			System.out.printf("%d %s %d = %d\n", i, d, j, v);
			System.out.println("����Ͻðڽ��ϱ�? (y/n)");
			sc.nextLine();
			f = sc.nextLine();
		} while(f == "n");
		*/
		int a = 0;
		int b = 0;
		char op = 0;
		int result = 0;
		char isRepeat = 0; //�ΰ��� ���� �ִ� ������ is�� �����ϴ°� ����.
		
		do {
			System.out.print("a: ");
			a = sc.nextInt(); sc.nextLine();
			System.out.print("op: ");
			op = sc.nextLine().charAt(0);
			System.out.print("b: ");
			b = sc.nextInt(); sc.nextLine();
			
			switch(op) {
			case '+': result = a + b; break;
			case '-': result = a - b; break;
			case '*': result = a * b; break;
			case '/': result = a / b; 
			}
			System.out.printf("%d %c %d = %d\n", a, op, b, result);
			System.out.println("����Ͻðڽ��ϱ�? (y/n)");
			isRepeat = sc.nextLine().charAt(0);
		} while(isRepeat == 'y');
		
		System.out.println("��");
	}
}
/*
����] ���⸦ ������
�����ڴ� + - * /�̴�.
/�� ���� ��´�.
--
a:1
op: +
b : 2
1+2=3
����Ͻðڽ��ϱ�? (y/n)
*/
