package ch05.ex08.case03;

public class Main {
	public static void main(String[] args) {
		Citrus citrus = new Citrus();
		
		//citrus = new Citrus("레드향");
		
		System.out.println(citrus.getName());
		
		Citrus citrus1 = new Citrus();
		Citrus citrus2 = new Citrus("천혜향");
		System.out.println(citrus1.getName());
		System.out.println(citrus2.getName());
	}

}
