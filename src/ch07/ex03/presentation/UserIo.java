package ch07.ex03.presentation;

import ch07.ex03.domain.User;
import ch07.ex03.service.UserService;

/**
 * @작성일 2022. 6. 29.
 */
public class UserIo {
	private UserService userService;

	public UserIo(UserService userService) {
		this.userService = userService;
	}

	public void play() {
		String userName = Console.inStr("회원명을 입력하세요.");
		userService.addUser(new User(userName));
		
		Console.info(userService.getUser());
	}
}
