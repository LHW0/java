package ch05.home.ex05.case06;

public class Main {
	public static void main(String[] args) {
		Phone phone = new Phone();
		Person person = new Person();
		
		phone.setMakerName("�Ｚ");
		phone.setPrice(1_000_000);
		
		person.setName("���Ѽ�");
		
		person.setPhone(phone);
		
		person.msg();
		person.call();
		person.game();
	}
}

/* ���Ѽ��� �Ｚ���� 1�鸸�� �ְ� ����ϴ�.
�տ� �� ���� ���� �幵�մϴ�.

�޼����� �������ϴ�
������ ����, ��ȭ�� �ɾ�� ������ �ȵ˴ϴ�
��� �ڿ� �ٽ� ������ ���ƴϴ�

��ٸ��µ��� ������ ������ �մϴ�
	*/