package www.vanu.vanushoppee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import www.vanu.vanushoppee.DAO.UserDAO;
import www.vanu.vanushoppee.Model.User;

@RestController
public class UserController {
	@Autowired
	UserDAO userdao;  //Service which will do all data retrieval/manipulation work

	
	//-------------------Retrieve All Users--------------------------------------------------------
	
	@RequestMapping(value = "/user/", method = RequestMethod.GET)
	public ResponseEntity<List<User>> listAllUsers() {
		List<User> users = userdao.findAllUsers();
		if(users.isEmpty()){
			return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}


	//-------------------Retrieve Single User--------------------------------------------------------
	
	@RequestMapping(value = "/user/{uid}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> getUser(@PathVariable("id") long uid) {
		System.out.println("Fetching User with id " + uid);
		User user = userdao.findById(uid);
		if (user == null) {
			System.out.println("User with id " + uid + " not found");
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	
	
	//-------------------Create a User--------------------------------------------------------
	
	@RequestMapping(value = "/user/", method = RequestMethod.POST)
	public ResponseEntity<Void> createUser(@RequestBody User user, 	UriComponentsBuilder ucBuilder) {
		System.out.println("Creating User " + user.getUsername());

		if (userdao.isUserExist(user)) {
			System.out.println("A User with name " + user.getUsername() + " already exist");
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}

		userdao.saveUser(user);

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/user/{uid}").buildAndExpand(user.getUid()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	
	//------------------- Update a User --------------------------------------------------------
	
	@RequestMapping(value = "/user/{uid}", method = RequestMethod.PUT)
	public ResponseEntity<User> updateUser(@PathVariable("id") long uid, @RequestBody User user) {
		System.out.println("Updating User " + uid);
		
		User currentUser = userdao.findById(uid);
		
		if (currentUser==null) {
			System.out.println("User with id " + uid + " not found");
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}

		currentUser.setUsername(user.getUsername());

		
		userdao.updateUser(currentUser);
		return new ResponseEntity<User>(currentUser, HttpStatus.OK);
	}

	//------------------- Delete a User --------------------------------------------------------
	
	@RequestMapping(value = "/user/{uid}", method = RequestMethod.DELETE)
	public ResponseEntity<User> deleteUser(@PathVariable("uid") long uid) {
		System.out.println("Fetching & Deleting User with uid " + uid);

		User user = userdao.findById(uid);
		if (user == null) {
			System.out.println("Unable to delete. User with id " + uid + " not found");
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}

		userdao.deleteUserById(uid);
		return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
	}

	
	//------------------- Delete All User --------------------------------------------------------
	
	@RequestMapping(value = "/user/", method = RequestMethod.DELETE)
	public ResponseEntity<User> deleteAllUsers() {
		System.out.println("Deleting All Users");

		userdao.deleteAllUsers();
		return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
	}

}