package ch04.home.ex03;

public class Money {
	public static void main(String[] args) {
		int price = 30000;
		int tot = 0; //�տ��嵷
		int tmp = 0; //������
		
		while(tot < price) {
			tmp = ((int)(Math.random() * 30) + 1) * 1000;
//			                            �ִ밪  �ּҰ�
			System.out.println(tmp);
			tot += tmp;
		}
		System.out.println(tot + "���� ���½��ϴ�.");
//		unit test 
//		integration test
	}

}
/*
����] 3���� ¥�� ���ǰ��� ġ���.

�������� ���� ������ ������.
������ 5�������� ����.
���� ���� ��(����)�� �������� �ʴ´�.
�ѹ��� 3���� ���ϸ� ������.
����������, �����ݾ��� ����Ѵ�.

12000
2000
6000
10000

30000���� ���½��ϴ�.

*/