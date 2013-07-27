package demo.servce;

import demo.model.Movie;
import demo.repository.MovieRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MovieService {

	public List<Movie> findAll() {
		return MovieRepository.getInstance().findAll();
	}
}
