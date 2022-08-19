package ch02.ex03;

public class C01IntDouble {
	public static void main(String[] args) {
		int i = 1;
		double d = 0.0;
		
		d = i; // 프로모션
		System.out.printf("%f, %d\n", d, i); // 실수f 정수d
		
		d = (double)i; // d = 캐스팅연산자의 리턴값 ( i의 값x )
		System.out.printf("%f, %d\n", d, i); 
		
		//i = d; 타입 에러
		i = (int)d;
		System.out.printf("%f, %d\n", d, i); 
		
		}
}