package ch02.ex02;

public class C03Str {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int sum = a + b + c;
		System.out.printf("sum: %d\n", sum);
		
		String sumStr = "" + sum;
		System.out.println(sumStr);
		
		String s = a + b + ""; //숫자3에서 문자로
		System.out.println(s);
		
		s = "" + a + b;
		System.out.println(s); // 문자되고 1과 2가 더해진다
		
		String dialog = "John said, \"hello\""; //"두개일때 역슬처리하면 일반문자로
		System.out.println(dialog);
		}
}