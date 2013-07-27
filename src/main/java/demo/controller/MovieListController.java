package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieListController extends AbstractMovieController {

	@RequestMapping("/movie/list")
	public String init() {
		return "pages/movie/list";
	}
}
