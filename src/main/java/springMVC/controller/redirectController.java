package springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class redirectController {
	
	
	//this is for redirect prefix
	@RequestMapping("/one")
	public String one() {
		
		System.out.println("this is one handler");
		return "redirect:/two";
	}
	
	//this is for redirect view
	@RequestMapping("/three")
	public RedirectView three() {
		System.out.println("this is handler three");
		RedirectView rv = new RedirectView();
		rv.setUrl("two");
		return rv;
	}
	
	@RequestMapping("/two")
	public String two() {
		
		System.out.println("this is two handler");
		return "contact1";
	}
}
