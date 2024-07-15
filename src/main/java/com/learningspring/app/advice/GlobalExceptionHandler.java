package com.learningspring.app.advice;

import com.learningspring.app.dto.ResponseDto;
import com.learningspring.app.exceptions.StudentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseDto> handleGenericException(Exception ex) {
        ResponseEntity<ResponseDto> response = buildResponse(
                HttpStatus.INTERNAL_SERVER_ERROR,
                "Something went wrong, we are working on it",
                ex);
        return response;
    }

    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<ResponseDto> handleGenericException(StudentNotFoundException ex) {
        ResponseEntity<ResponseDto> response = buildResponse(
                HttpStatus.NOT_FOUND,
                "Student not found",
                ex);
        return response;
    }

    private ResponseEntity<ResponseDto> buildResponse(
            HttpStatus status,
            String msg,
            Exception ex) {
        ResponseDto data = new ResponseDto(false, msg, null, null, ex.getMessage());
        return new ResponseEntity<>(data, status);
    }


}
