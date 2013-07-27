package demo.valdator;

import demo.model.Movie;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class NewMovieValidator implements Validator {


	@Override
	public void validate(Object obj, Errors errors) {
		validateTitle(errors);
		validateGenres(errors);
	}

	@Override
	public boolean supports(Class aClass) {
		return Movie.class.equals(aClass);
	}

	private void validateTitle(Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title", "error.required.movie.title", "Required field");
	}

	private void validateGenres(Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "genres", "error.required.movie.genres", "Required field");
	}
}
