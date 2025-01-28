package com.neoteric.validations.exception;

import com.neoteric.validations.model.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//@ControllerAdvice
public class ExceptionHandlerConfig {


  //  @ExceptionHandler(InvalidDetailsException.class)
   public ResponseEntity<ErrorDetails> handleException(Exception e){
       ErrorDetails errorDetails= new ErrorDetails();
       errorDetails.getMessage();
       return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
   }

}
