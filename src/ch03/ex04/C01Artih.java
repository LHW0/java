package ch03.ex04;

public class C01Artih {
	public static void main(String[] args) {
		byte a = 3;
		byte b = 2;
		byte c = (byte)(a + b); // 산술연산 시  int
		
		System.out.println(c);

		// c = c + 1
		c++;
		double d = a / b; // overfloor
		System.out.println(d);
		
		d = (double)a / (double)b;
		System.out.println(d);
		d = 1.0 * a / b;
		System.out.println(d);
		
		d = (double)(a / b); // 잘못된 방식
		System.out.println(d);
		d = a / b * 1.0;
		System.out.println(d); //잘못된 방식2
		
	}
}
