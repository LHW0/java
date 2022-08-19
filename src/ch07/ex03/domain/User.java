package ch07.ex03.domain;

/**
 * @¿€º∫¿œ 2022. 6. 29.
 */
public class User {
	private String name;
	
	public User(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
