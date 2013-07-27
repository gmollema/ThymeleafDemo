package demo.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController  {

	@RequestMapping({"/", "/home"})
	public String init(Model model) {
		return "pages/home";
	}

}
