package ch04.home.ex01;

import java.util.Scanner;

public class Grade2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		String grade = "";
		String ix = "";
				
		System.out.print("���� :");
		score = sc.nextInt();

		if(score >= 90) grade = "A";
		else if(score >= 80) grade ="B";
		else System.out.print("C");
		
		if((score %10) >= 8 || score == 100) ix = "+";
		else if((score %10 < 4)) ix = "-";
		
		System.out.print(grade + ix);
		}
}
/*
���� �������� ������ �ο��϶�.
98 �̻� A+
94 �̻� A
90 �̻� A-
88 �̻� B+
84 �̻� B
80 �̻� B-
80 �̸� C

ex)
����: 100
A+
*/