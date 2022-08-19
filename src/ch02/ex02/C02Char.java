package ch02.ex02;

public class C02Char {
	public static void main(String[] args ) {
		char c = 'A'; // vm은 유니코드로 , 2byte, 양수값
		System.out.printf("%c, %s\n", c, Integer. toBinaryString(c));
		
		c = 65;
		System.out.printf("%c, %s\n", c, Integer. toBinaryString(c));
		
		c = 0x0041; // 16진수 알려주기위해 0x붙힌다.
		System.out.printf("%c, %s\n", c, Integer. toBinaryString(c));
		
		c = '\u0041';  // char에 ''쓰려면 유니코드에 백슬u붙히기
		System.out.printf("%c, %s", c, Integer. toBinaryString(c));
	}
}
