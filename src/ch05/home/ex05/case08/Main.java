package ch05.home.ex05.case08;

public class Main {
	public static void main(String[] args) {
		Ball ball = new Ball();
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		
		person1.setName("���Ѽ�");
		person2.setName("�ѾƸ�");
		person3.setName("�����");
		
		person3.kick(person2.pass(person1.pass(ball)));
		person3.kick(person2.pass(person2.receive(person1.kick(ball))));
		
	}
}
/* ���Ѽ�, �ѾƸ�, ������� �౸�� �Ѵ�.
�Ѽ��̰� �Ƹ������� ���� �н��Ѵ�.
�Ƹ��̴� ���������� ���� �н��Ѵ�.
�����̴� ���� ����.
*/