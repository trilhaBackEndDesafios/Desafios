package br.com.desafiofour.exception;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandle extends ResponseEntityExceptionHandler {

	@Autowired
	private MessageSource messageSource;

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {

		TypeErro problemType = TypeErro.DADOS_INVALIDOS;
		String detail = "Um ou mais campos estão inválidos. Faça o preenchimento correto e tente novamente.";

		BindingResult bindingResult = ex.getBindingResult();

		List<ErrorResponse.Field> problemFields = bindingResult.getFieldErrors().stream().map(fieldError -> {

			String message = messageSource.getMessage(fieldError, LocaleContextHolder.getLocale());
			return ErrorResponse.Field.builder()
					.name(fieldError.getField())
					.message(message).build();
		}).collect(Collectors.toList());

		ErrorResponse problem = createProblemBuilder(status, problemType, detail)
				.message(detail)
				.fields(problemFields)
				.build();

		return handleExceptionInternal(ex, problem, headers, status, request);

	}

	@Override
	protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body, HttpHeaders headers,
			HttpStatus status, WebRequest request) {

		if (body == null) {
			body = ErrorResponse.builder()
					.status(status.value())
					.title(status.getReasonPhrase())
					.build();
		} else if (body instanceof String) {
			body = ErrorResponse.builder()
					.status(status.value())
					.title((String) body)
					.build();
		}

		return super.handleExceptionInternal(ex, body, headers, status, request);
	}

	private ErrorResponse.ErrorResponseBuilder createProblemBuilder(HttpStatus status, TypeErro typeErro,
			String detail) {

		return ErrorResponse.builder()
				.status(status.value())
				.type(typeErro.getUri())
				.title(typeErro.getTitle())
				.detail(detail);
	}

	@ExceptionHandler(CalculateAverageException.class)
	public ResponseEntity<?> getArithmeticException(CalculateAverageException ex, WebRequest request) {

		HttpStatus status = HttpStatus.NOT_FOUND;
		TypeErro problemType = TypeErro.DADOS_INVALIDOS;
		String detail = " Numero não pode ser divisivel por zero ";

		ErrorResponse errorReponse = ErrorResponse.builder()
				.status(status.value())
				.type(problemType.getUri())
				.title(problemType.getTitle())
				.detail(detail).build();

		return handleExceptionInternal(ex, errorReponse, new HttpHeaders(), status, request);

	}

	@ExceptionHandler(EntityNotFoundException.class)
	public ResponseEntity<?> getEntityNotFoundException(EntityNotFoundException ex, WebRequest request) {

		HttpStatus status = HttpStatus.NOT_FOUND;
		TypeErro problemType = TypeErro.DADOS_INVALIDOS;
		String detail = " Parâmetros com valores incorretos ";

		ErrorResponse errorReponse = ErrorResponse.builder()
				.status(status.value())
				.type(problemType.getUri())
				.title(problemType.getTitle())
				.detail(detail).build();

		return handleExceptionInternal(ex, errorReponse, new HttpHeaders(), status, request);

	}
	@ExceptionHandler(EntityIsEmptyExceptions.class)
	public ResponseEntity<?> getEntityIsEmptyExceptions(EntityIsEmptyExceptions ex, WebRequest request) {

		HttpStatus status = HttpStatus.NOT_FOUND;
		TypeErro problemType = TypeErro.DADOS_INVALIDOS;
		String detail = " Parâmetros com valores incorretos ";

		ErrorResponse errorReponse = ErrorResponse.builder()
				.status(status.value())
				.type(problemType.getUri())
				.title(problemType.getTitle())
				.detail(detail).build();

		return handleExceptionInternal(ex, errorReponse, new HttpHeaders(), status, request);

	}
	@ExceptionHandler(EntityNullException.class)
	public ResponseEntity<?> getEntityNullExceptions(EntityNullException ex, WebRequest request) {

		HttpStatus status = HttpStatus.NOT_FOUND;
		TypeErro problemType = TypeErro.DADOS_INVALIDOS;
		String detail = " Parâmetros com valores incorretos ";

		ErrorResponse errorReponse = ErrorResponse.builder()
				.status(status.value())
				.type(problemType.getUri())
				.title(problemType.getTitle())
				.detail(detail).build();

		return handleExceptionInternal(ex, errorReponse, new HttpHeaders(), status, request);

	}
}
