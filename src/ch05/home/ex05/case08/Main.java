package ch05.home.ex05.case08;

public class Main {
	public static void main(String[] args) {
		Ball ball = new Ball();
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		
		person1.setName("최한석");
		person2.setName("한아름");
		person3.setName("양승일");
		
		person3.kick(person2.pass(person1.pass(ball)));
		person3.kick(person2.pass(person2.receive(person1.kick(ball))));
		
	}
}
/* 최한석, 한아름, 양승일이 축구를 한다.
한석이가 아름이한테 공을 패스한다.
아름이는 승일이한테 공을 패스한다.
승일이는 공을 찬다.
*/