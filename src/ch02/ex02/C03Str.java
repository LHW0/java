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
		
		String s = a + b + ""; //����3���� ���ڷ�
		System.out.println(s);
		
		s = "" + a + b;
		System.out.println(s); // ���ڵǰ� 1�� 2�� ��������
		
		String dialog = "John said, \"hello\""; //"�ΰ��϶� ����ó���ϸ� �Ϲݹ��ڷ�
		System.out.println(dialog);
		}
}