package ch02.ex01;

import java.util.Scanner;

public class C03Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("���ڿ��� �Է��ϼ���.\n>");
		String in_val = sc.nextLine(); snake case
		System.out.printf("%s�� �Է��߽��ϴ�.", inVal);
		//����]<�Էµ�����>�� �Է��߽��ϴ�. �� Ȯ�� �޼����� ����Ѵ�.
		
		
		System.out.println("���ڸ� �Է��ϼ���.\n>");
		int i = sc.nextInt();
		System.out.println(i+"�� �Է��߽��ϴ�.");
	
		Scanner sc = new Scanner(System.in);
		�̰ź��� �����
		nextLine String type
		nextInt int type
		 */
		

	/*
		System.out.print("���ڸ� �Է��ϼ���.\n>");
		int i = sc.nextInt();
		System.out.println(i+"�� �Է��߽��ϴ�.");
		
		System.out.print("���ڸ� �Է��ϼ���.\n>");
		int i2 = sc.nextInt();sc.nextLine();
		System.out.println(i2+"�� �Է��߽��ϴ�.");
		
		System.out.print("���ڿ��� �Է��ϼ���.\n>");
		String inVal = sc.nextLine();
		System.out.printf(inVal+"�� �Է��߽��ϴ�.", inVal);
	*/
		
		System.out.print("���ڸ� �Է��ϼ���.\n>");
		char c = sc.nextLine().charAt(4);		
		System.out.println(c + "�� �Է��߽��ϴ�.");
	}
}
