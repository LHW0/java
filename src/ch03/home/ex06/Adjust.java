package ch03.home.ex06;

import java.util.Scanner;

public class Adjust {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = 0;
		double b = 0;
		
		System.out.println("x: ");
		
		a = sc.nextDouble();
		b = a - a%1;
		
		System.out.println(b);
		
				
	
	}

}
/*
% �����ڸ� �̿��ؼ�, �Ǽ����� �Ҽ��� ���ϸ� ����ó���϶�
(casting), Math API�� ������� �ʴ´�
�Ǽ����� sc.nextDouble() �� �Է��Ѵ�.abstract

ex)
x: 3.1492
3.0
*/