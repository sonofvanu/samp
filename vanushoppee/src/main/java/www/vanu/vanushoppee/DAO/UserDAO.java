package www.vanu.vanushoppee.DAO;

import java.util.List;

import www.vanu.vanushoppee.Model.User;

public interface UserDAO {
User findById(long uid);
	
	User findByName(String username);
	
	void saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUserById(long uid);

	List<User> findAllUsers(); 
	
	void deleteAllUsers();
	
	public boolean isUserExist(User user);
}
