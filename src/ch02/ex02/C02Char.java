package ch02.ex02;

public class C02Char {
	public static void main(String[] args ) {
		char c = 'A'; // vm�� �����ڵ�� , 2byte, �����
		System.out.printf("%c, %s\n", c, Integer. toBinaryString(c));
		
		c = 65;
		System.out.printf("%c, %s\n", c, Integer. toBinaryString(c));
		
		c = 0x0041; // 16���� �˷��ֱ����� 0x������.
		System.out.printf("%c, %s\n", c, Integer. toBinaryString(c));
		
		c = '\u0041';  // char�� ''������ �����ڵ忡 �齽u������
		System.out.printf("%c, %s", c, Integer. toBinaryString(c));
	}
}
