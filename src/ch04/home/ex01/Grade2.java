package ch04.home.ex01;

import java.util.Scanner;

public class Grade2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		String grade = "";
		String ix = "";
				
		System.out.print("점수 :");
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
다음 구간별로 학점을 부여하라.
98 이상 A+
94 이상 A
90 이상 A-
88 이상 B+
84 이상 B
80 이상 B-
80 미만 C

ex)
점수: 100
A+
*/