package ch07.ex03.dao;

import ch07.ex03.domain.User;

/**
 * @�ۼ��� 2022. 6. 29.
 */
public class UserDaoImpl implements UserDao {
	private User user; // DEL: database ��� �ӽ÷� �д�. ������ ����.
	
	@Override
	public User selectUser() {
		return user;
	}

	@Override
	public void insertUser(User user) {
		this.user = user;
	}
}
