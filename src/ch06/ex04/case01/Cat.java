package ch06.ex04.case01;

public class Cat extends Animal {
	private int age;
	
	public Cat(String name, int age) {
		//super();
		super(name);
		//this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}

}
