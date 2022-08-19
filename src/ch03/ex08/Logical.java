package ch03.ex08;

public class Logical {
	public static void main(String[] args) {
		boolean b = false;
		
		b = true && true;
		b = (2 > 1) && (2 > 1);
		b = 2 < 1 && 2 > 1;
		b = 2 < 1 || 2 > 1;
		b = 2 < 1 || 2 < 1;
		
		System.out.println(b);
		
		int x = 0;
		int y = 0;
		b = ++x < 0 && ++y < 0; // ++x < 0 이 false 이기 때문에 ++y는 계산하지 않음 고로 0
		
		x = 0;
		y = 0;
		b = ++x < 0 & ++y < 0; // && : 빠른처리 , &: 전부 처리
		
		x = 0;
		y = 0;
		b = ++x < 0 || ++y < 0;
		
		x = 0;
		y = 0;
		b = ++x > 0 || ++y < 0;  // ++x > 0 이 true 이기 때문에 ++y는 계산하지 않음
		
		x = 0;
		y = 0;
		b = ++x < 0 || ++y > 0;
		
		
		
		System.out.printf("x: %d, y: %d, b: %b", x, y, b);
		
		
		

	}

}
