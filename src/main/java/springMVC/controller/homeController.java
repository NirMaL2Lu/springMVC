package springMVC.controller;


import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home page");
		model.addAttribute("name", "Nirmal Chandra Sahoo");
		model.addAttribute("id", 123);
		List<String> friends = new ArrayList<String>();
		friends.add("Sonu");
		friends.add("Sunil");
		friends.add("Pinku");
		friends.add("Bubu");
		model.addAttribute("f",friends);
		
		
		return "home";
	}
	
	@RequestMapping("/contact")
	public String contact() {
		System.out.println("this is contact page");
		return "contact";
	}
	
	
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is contact page");
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", "Nirmal");
		mav.addObject("rollno",123);
		mav.setViewName("help");
		LocalDateTime ldt = LocalDateTime.now();
		mav.addObject("time", ldt);
		
		List<Integer> marks= new ArrayList<Integer>();
		marks.add(90);
		marks.add(89);
		marks.add(78);
		marks.add(76);
		mav.addObject("marks", marks);
		Locale[] locale = DateFormat.getAvailableLocales();
		mav.addObject("locale", locale);
		String [] countries =Locale.getISOCountries();
		mav.addObject("countries", countries);
		
		return mav;
	}
}
