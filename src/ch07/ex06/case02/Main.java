package ch07.ex06.case02;

public class Main {
	public static void main(String[] args) {
		Life alien1 = new Alien();
		Alien alien2 = new Alien();
		
		alien1.eat();
		alien2.eat();
		
		alien1.shout();
		alien2.shout();
		
		Life.eat();
		Alien.eat(); //static메서드는 접두사로 class명 사용하기
	}

}
