package ch03.home.ex09;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sum = 0;
		double mean = 0;
		char grade = 0;
		
		
		System.out.print("����: ");
		kor = sc.nextInt();
		System.out.print("����: ");
		eng = sc.nextInt();
		System.out.print("����: ");
		math = sc.nextInt();
		
		sum = kor + eng + math;
		mean = sum/3.0;
		grade = (mean >= 90) ? 'A' : (mean >= 80 ? 'B' : 'C');
		
		System.out.printf("����: %d \n���: %.1f \n����: %c", sum, mean, grade);
		
	}

}


/*
����, ����, ���� ������ �Է¹޴´�
����, ���, ������ ����Ѵ�.
��� ������ �Ҽ������� 1�ڸ������� ����Ѵ�.

90<= mean <=100 : A
80<= mean <=90 : B
        mean < 80 : C
        
ex : 
���� 95
���� 100
���� 100

���� : 295
��� : 98.3
���� : A
*/