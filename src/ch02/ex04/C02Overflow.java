package ch02.ex04;

public class C02Overflow {
	public static void main(String[] args) {
//		byte b = 128; // type mismatch
		byte b = 127;
//		b = b + 1; 컴파일에러

		b++; // ++연산자
		b++;
		System.out.println(b);
		
	}
}
