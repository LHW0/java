package ch05.home.ex02.case02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Paper paper = new Paper();
		
		System.out.println("�޼���: ");
		paper.setMsg(sc.nextLine());
		System.out.println("�ۼ���: ");
		paper.setWriterName(sc.nextLine());
		
		System.out.printf("%s from %s.", paper.getMsg(), paper.getWriterName());
	}

}
/*
���̿� �޼����� �ۼ��ڸ��� ����϶�

�޼���: hello
�ۼ��ڸ�: terry

hello from terry.
*/