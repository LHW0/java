package ch04.home.ex02;

public class Coupon {
	public static void main(String[] args) {
		int grade = 3;
		String coupon = "";
		
		if(grade == 3) coupon = "10,000원";
		else if(grade == 2) coupon = "5,000원";
		else if(grade == 1) coupon = "1,000원";
		
		System.out.println(coupon);
	}
}
/*
과제] ch04.ex02.C03Switch 를 if로 refactoring 하라.
*/