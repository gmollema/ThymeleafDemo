package demo.controller;

import demo.model.Movie;
import demo.servce.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import java.util.Collections;
import java.util.List;

public abstract class AbstractMovieController {

	public static final String ATTR_ALL_MOVIES = "allMovies";
	private static final String MOVIE_LIST_KEY = "MOVIE_LIST_KEY";

	@Autowired
	protected MovieService movieService;

	@ModelAttribute(ATTR_ALL_MOVIES)
	public List<Movie> allMovies(final HttpServletRequest request) {
		List<Movie> movieList;
		Object movieListAttribute = request.getSession().getAttribute(MOVIE_LIST_KEY);
		if (movieListAttribute != null) {
			movieList = (List<Movie>) movieListAttribute;
		} else {
			movieList = movieService.findAll();
		}
		request.getSession().setAttribute(MOVIE_LIST_KEY, movieList);
		return movieList;
	}

    protected void getMovie(final HttpServletRequest request, Movie movie) {
        List<Movie> movieList = allMovies(request);
        for(Movie m : movieList) {
            if(m.getId().equals(movie.getId())) {
                Movie.clone(movie, m);
            }
        }
    }

    protected void saveOrUpdateMovie(final HttpServletRequest request, Movie movie) {
        List<Movie> movieList = allMovies(request);
        if (movie.getId() != null) {
            Collections.replaceAll(movieList, movie, movie);
        } else {
            movie.setId(movieList.size()+1);
            movieList.add(movie);
        }
    }
}
