package demo.controller;

import demo.model.Genre;
import demo.model.Movie;
import demo.valdator.NewMovieValidator;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class MovieNewController extends AbstractMovieController {

	@Autowired
	private MessageSource messageSource;

	@Autowired
	private NewMovieValidator validator;

	@InitBinder
	public void initDateBinder(final WebDataBinder dataBinder, final Locale locale) {
		final String dateFormat = this.messageSource.getMessage("date.format", null, locale);
		final SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		sdf.setLenient(false);
		dataBinder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, false));
	}

	@RequestMapping("/movie/new")
	public String init(final Movie movie) {
		return "pages/movie/new";
	}

	@RequestMapping("/movie/edit")
	public String edit(final HttpServletRequest request,Movie movie) {
		getMovie(request, movie);
		return "pages/movie/new";
	}

	@RequestMapping(value="/movie/new", params={"save"} )
	public String saveMovie(final Movie movie, final BindingResult bindingResult, final HttpServletRequest request) {
		validator.validate(movie, bindingResult);
		if (bindingResult.hasErrors()) {
			return "pages/movie/new";
		} else {
			saveOrUpdateMovie(request, movie);
			return "pages/movie/list";
		}
	}

	@ModelAttribute("genreList")
	public List<Genre> populateGenres() {
		return Arrays.asList(Genre.ALL);
	}

    @ModelAttribute("releaseYearList")
    public List<Integer> populateReleaseYears() {
        List<Integer> releaseYearList = new ArrayList<Integer>();
        int currentYear = new DateTime().getYear();
        for (int i=currentYear; i>currentYear-30; i--){
            releaseYearList.add(i);
        }
        return releaseYearList;
    }

}
