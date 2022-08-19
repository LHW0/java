package ch04.home.ex01;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		String grade = "";
		int tenDigit = 0;
		int oneDigit = 0;
				
		System.out.print("점수 :");
		score = sc.nextInt();
		
		tenDigit = score / 10;
		oneDigit = score % 10;
		
		if(tenDigit >=9) grade = "A";
		else if(tenDigit >= 8) grade = "B";
		else grade = "C"; 
		
		if(score >= 80) {
			if(oneDigit >= 8 || tenDigit == 10) grade += "+";
			else if(0 <= oneDigit && oneDigit < 4) grade += "-";
			
			
		
		System.out.println(grade);
		
		/*
		if(score >= 98) System.out.print("A+");
		else if(score >= 94) System.out.print("A");
		else if(score >= 90) System.out.print("A-");
		else if(score >= 88) System.out.print("B+");
		else if(score >= 84) System.out.print("B");
		else if(score >= 80) System.out.print("B-");
		else System.out.print("C");*/
		
		
		
		/* if(score >= 90) grade = "A";
		else if(score >= 80) grade ="B"; 
		else grade = "C";
		
		if((score %10 >= 8)) System.out.print(grade +"+");
			else if((score %10 >= 4)) System.out.print(grade +"");
			else System.out.print(grade +"-");
		*/
			
		}
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