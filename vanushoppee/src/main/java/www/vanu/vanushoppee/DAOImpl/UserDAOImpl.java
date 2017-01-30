package www.vanu.vanushoppee.DAOImpl;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import www.vanu.vanushoppee.DAO.UserDAO;
import www.vanu.vanushoppee.Model.User;

@Service("user")
@Transactional
public class UserDAOImpl implements UserDAO {
private static final AtomicLong counter = new AtomicLong();
	
	private static List<User> users;
	
	static{
		users= populateDummyUsers();
	}

	public List<User> findAllUsers() {
		return users;
	}
	
	public User findById(long id) {
		for(User user : users){
			if(user.getUid() == id){
				return user;
			}
		}
		return null;
	}
	
	public User findByName(String username) {
		for(User user : users){
			if(user.getUsername().equalsIgnoreCase(username)){
				return user;
			}
		}
		return null;
	}
	
	public void saveUser(User user) {
		user.setUid(counter.incrementAndGet());
		users.add(user);
	}

	public void updateUser(User user) {
		int index = users.indexOf(user);
		users.set(index, user);
	}

	public void deleteUserById(long id) {
		
		for (Iterator<User> iterator = users.iterator(); iterator.hasNext(); ) {
		    User user = iterator.next();
		    if (user.getUid() == id) {
		        iterator.remove();
		    }
		}
	}

	public boolean isUserExist(User user) {
		return findByName(user.getUsername())!=null;
	}

	private static List<User> populateDummyUsers(){
		List<User> users = new ArrayList<User>();
		
		return users;
	}

	public void deleteAllUsers() {
		users.clear();
	}
}
