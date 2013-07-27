package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MovieCounterController extends AbstractMovieController {

    @RequestMapping("/movie/counter")
    public String init(ModelMap map, final HttpServletRequest request) {
	    map.addAttribute("allMovies", allMovies(request));
        return "movieCounter";
    }
}
