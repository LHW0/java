package ch07.ex04.case06;

public class Main {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		
		animals[0] = new Cat("«Ï∑’¿Ã");
		animals[1] = new Dog("ø–ø–¿Ã");
		animals[2] = new Dog("º∫≈≠¿Ã");
		
		for(Animal animal: animals)
			System.out.println(animal);
		
		Object[] objs = new Object[3];
		objs[0] = new Cat("«Ï∑’¿Ã");
		objs[1] = new Dog("ø–ø–¿Ã");
		objs[2] = new Dog("º∫≈≠¿Ã");
		
		for(Object obj: objs)
			System.out.println(obj);
	}

}
