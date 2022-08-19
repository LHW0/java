package ch07.ex03.dao;

import ch07.ex03.domain.User;

/**
 * @¿€º∫¿œ 2022. 6. 29.
 */
public interface UserDao {
	public User selectUser();
	public void insertUser(User user);
}
