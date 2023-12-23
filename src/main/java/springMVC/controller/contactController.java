package springMVC.controller;


import org.apache.tomcat.util.log.UserDataHelper.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springMVC.model.User;
import springMVC.service.userService;



@Controller
public class contactController {
	@Autowired
	private userService userservice;
	
	
	@ModelAttribute
	public void commonDataForModel(Model model) {
		model.addAttribute("Header", "Learn Code with Nirmal");
		model.addAttribute("Desc", "Programming is damn easy");
		System.out.println("Adding common data to model");
	}
	
	
	@RequestMapping("/contact1")
	public String showForm(Model model) {
		System.out.println("Showing form page");
		
		return "contact1";
	}
	
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model) {
		
		System.out.println(user);
		if (user.getName().isEmpty()) {
			return "redirect:/contact1";
			
		}
		int createUser = this.userservice.createUser(user);
		model.addAttribute("msg", "User created with UserId : "+createUser);
		//model.addAttribute("user", user);
		
		return "success";
	}
	
}

/*
@RequestMapping(path = "/processform", method = RequestMethod.POST)
public String handleForm(@RequestParam("email") String userEmail,
		@RequestParam("name") String userName,
		@RequestParam("password") String userPassword,
		Model model) {
	
	
	User user = new User();
//	set user value
	user.setEmail(userEmail);
	user.setName(userName);
	user.setPassword(userPassword);
	
//	System.out.println("Your name is :"+userName);
//	System.out.println("Your email is :"+userEmail);
//	System.out.println("Your password is :"+userPassword);
//	model.addAttribute("name", userName);
//	model.addAttribute("email", userEmail);
//	model.addAttribute("password", userPassword);
	System.out.println(user);
	
	//add attribute
	model.addAttribute("user", user);
	
	return "success";
}
*/
