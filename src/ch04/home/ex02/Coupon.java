package ch04.home.ex02;

public class Coupon {
	public static void main(String[] args) {
		int grade = 3;
		String coupon = "";
		
		if(grade == 3) coupon = "10,000��";
		else if(grade == 2) coupon = "5,000��";
		else if(grade == 1) coupon = "1,000��";
		
		System.out.println(coupon);
	}
}
/*
����] ch04.ex02.C03Switch �� if�� refactoring �϶�.
*/