package ch07.ex03.dao;

import ch07.ex03.domain.User;

/**
 * @작성일 2022. 6. 29.
 */
public class UserDaoImpl implements UserDao {
	private User user; // DEL: database 대신 임시로 둔다. 원래는 없음.
	
	@Override
	public User selectUser() {
		return user;
	}

	@Override
	public void insertUser(User user) {
		this.user = user;
	}
}
