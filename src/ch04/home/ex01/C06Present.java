package ch04.home.ex01;

import java.util.Scanner;

public class C06Present {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;//���ڸ� ���ڷ� �ٲٴ� �۾� �߻�ȭ
		String prize = "";
		
		System.out.print("1.����� 2.��Ź��\n> ");
		choice = sc.nextInt();
		
		if(choice == 1) prize = "�����";
		else if(choice == 2) prize = "��Ź��";
		else prize = "ȭ����";//���� ó��
		
		System.out.println(prize);
		
		
	}

}
