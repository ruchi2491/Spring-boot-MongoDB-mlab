package io.atmecs.springbootstarter.mongodb.exception;

/**
 * @author ruchira.more
 *
 */
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class StatusNotFoundException extends RuntimeException {

	public StatusNotFoundException(String message) {
		super(message);
	}

	public StatusNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}