package ch02.ex03;

public class C02DoubleInt {
	public static void main(String[] args) {
		double d = 1.42;
		int i = (int)d;
		
		System.out.printf("%d %f\n",i,d);
		
		double f = Math.floor(d); //floor 이므로 내림
		double r = Math.round(d); // round 는 반올림
		
		System.out.printf("%f %f\n", f, r);
	}
}
