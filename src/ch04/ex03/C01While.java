package ch04.ex03;

public class C01While {
	public static void main(String[] args) {
		int weight = 88;
		int jumpcnt = 0;
		
		while(weight > 60) {
			jumpcnt++;
			weight--;
		}
		System.out.printf("%d�� �ٳѱ� �ؼ�, ������ %dkg�� �Ǿ����ϴ�", jumpcnt, weight);
		
	}

}
