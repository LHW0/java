package ch07.ex06.case02;

public class Alien extends Life{
	//@Override static 메서드는 상속불가 = Override 불가
	public static void eat() {
		System.out.println("Alien 먹다");
	}
	
	@Override
	public void shout() {
		System.out.println("Alien 소리치다");
	}

}
