package ch02.ex03;

public class C01IntDouble {
	public static void main(String[] args) {
		int i = 1;
		double d = 0.0;
		
		d = i; // ���θ��
		System.out.printf("%f, %d\n", d, i); // �Ǽ�f ����d
		
		d = (double)i; // d = ĳ���ÿ������� ���ϰ� ( i�� ��x )
		System.out.printf("%f, %d\n", d, i); 
		
		//i = d; Ÿ�� ����
		i = (int)d;
		System.out.printf("%f, %d\n", d, i); 
		
		}
}