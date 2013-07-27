package demo.repository;

import demo.model.Genre;
import demo.model.Movie;
import java.util.*;

public class MovieRepository {

	private final Map<Integer,Movie> movieById;

	public static MovieRepository getInstance() {
		return new MovieRepository();
	}

	private MovieRepository() {

		this.movieById = new LinkedHashMap<Integer, Movie>();

		final Movie movie1 = new Movie();
		movie1.setId(1);
		movie1.setTitle("The Hobbit: An Unexpected Journey");
        movie1.setYearOfRelease(2012);
		movie1.setDateAdded(new Date());
        movie1.setGenres(new Genre[]{Genre.ADVENTURE, Genre.FANTASY});
		this.movieById.put(movie1.getId(), movie1);


		final Movie movie2 = new Movie();
		movie2.setId(2);
		movie2.setTitle("The Green Mile");
        movie2.setYearOfRelease(1999);
		movie2.setDateAdded(new Date());
        movie2.setGenres(new Genre[]{Genre.DRAMA});
		this.movieById.put(movie2.getId(), movie2);

		final Movie movie3 = new Movie();
		movie3.setId(3);
		movie3.setTitle("Con Air");
        movie3.setYearOfRelease(1997);
        movie3.setGenres(new Genre[]{Genre.ACTION});
		movie3.setDateAdded(new Date());
		this.movieById.put(movie3.getId(), movie3);

		final Movie movie4 = new Movie();
		movie4.setId(4);
		movie4.setTitle("Finding Nemo");
        movie4.setYearOfRelease(2003);
		movie4.setDateAdded(new Date());
        movie4.setGenres(new Genre[]{Genre.ADVENTURE, Genre.ANIMATION});
		this.movieById.put(movie4.getId(), movie4);
	}

	public List<Movie> findAll() {
		return new ArrayList<Movie>(this.movieById.values());
	}

	public Movie findById(final Integer id) {
		return this.movieById.get(id);
	}

}
