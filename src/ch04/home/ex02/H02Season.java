package ch04.home.ex02;

import java.util.Scanner;

public class H02Season {
	public static void main(String[] args) {
		int month = 0;
		String season = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��: ");
		month = sc.nextInt();
		
		
		if(3 <= month && month <= 5) season = "��";
		else if(6< month && month <= 8) season = "����";
		else if(9< month && month <= 11) season = "����";
		else if(month == 12 || month == 1 || month == 2) season = "�ܿ�";
		else season = "�������� �ʴ� ��";
		System.out.printf("%d���� %s�Դϴ�", month, season);

		
		
		
		
		/*
		if((month == 3) || (month == 4) || (month == 5))
			season = "����";
		else if((month == 6) || (month == 7) || (month == 8))
			season = "������";
		else if((month == 9) || (month == 10) || (month == 11))
			season = "������";
		else if((month == 12) || (month == 1) || (month == 2))
			season = "�ܿ���";
		else season = "�������� �ʽ�";
		System.out.printf("%d���� %s�ϴ�", month, season);
			*/
			}
		
	}
/*
ch04.ex02.C04Season�� refactoring�Ѵ�.
switch�� if�� �ٲ۴�
�������� ���� ���� �Է� ��츦, ����ó���Ѵ�.
*/