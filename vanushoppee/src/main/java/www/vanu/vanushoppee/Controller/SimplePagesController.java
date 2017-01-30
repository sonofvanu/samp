package www.vanu.vanushoppee.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimplePagesController {
	
	@RequestMapping("/")
	public String gotoindex() {
		return ("index");
	}
	
	@RequestMapping("/userreg")
	public String gotousereg() {
		return ("UserRegistration");
	}
}
