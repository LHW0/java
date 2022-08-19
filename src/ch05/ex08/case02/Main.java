package ch05.ex08.case02;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		User user = new User("최한석", 25, LocalDate.now());
		
		User user1 = new User();
		user1.setName("양승일");
		user1.setAge(35);
		user1.setRegDate(LocalDate.now());
		
		System.out.printf("%s %d %s\n", user.getName(), user.getAge(), user.getRegDate());
		System.out.printf("%s %d %s", user1.getName(), user1.getAge(), user1.getRegDate());
		
	}

}
