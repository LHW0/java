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
		
		
		System.out.print("국어: ");
		kor = sc.nextInt();
		System.out.print("영어: ");
		eng = sc.nextInt();
		System.out.print("수학: ");
		math = sc.nextInt();
		
		sum = kor + eng + math;
		mean = sum/3.0;
		grade = (mean >= 90) ? 'A' : (mean >= 80 ? 'B' : 'C');
		
		System.out.printf("총점: %d \n평균: %.1f \n학점: %c", sum, mean, grade);
		
	}

}


/*
국어, 영어, 수학 점수를 입력받는다
총점, 평균, 학점을 출력한다.
평균 점수는 소수점이하 1자리까지만 출력한다.

90<= mean <=100 : A
80<= mean <=90 : B
        mean < 80 : C
        
ex : 
국어 95
영어 100
수학 100

총점 : 295
평균 : 98.3
학점 : A
*/