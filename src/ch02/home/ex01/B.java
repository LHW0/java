package ch02.home.ex01;

public class B {
	public static void main(String[] args) {	
		int score = 100;
		System.out.println(100);
		System.out.println(score);
		System.out.println(100 + 1);
		System.out.println(Math.random());
		
		System.out.print(200);
		System.out.print(300);
		System.out.print("\n");
		System.out.print(400);
		
		System.out.printf("%b %c %d %f %s\n", true, 'a', 10, 1.15,"hello");
		System.out.printf("%b/%c/%d/%f/%s\n", true, 'a', 10, 1.15,"hello");
		System.out.printf("%5b|%-5c|%5d|%5.2f|%5s\n", true, 'a', 10, 1.15,"hello");
		System.out.printf("%5b|%-5c|%5d|%.2f|%5s\n", true, 'a', 10, 1.15,"hello");
		
		String name = "���Ѽ�";	
		int age = 22;
		System.out.printf("%s %d", name, age);
		System.out.printf("\n%s�� %d���Դϴ�.", name, age);
		System.out.println();
		System.out.println(name + "��" + age + "���Դϴ�.");
		
	}
}