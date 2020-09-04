package com.barun.testproduct.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class OrderExceptionController {
	@org.springframework.web.bind.annotation.ExceptionHandler(value = OrderNotfoundException.class)
   public ResponseEntity<Object> exception(OrderNotfoundException exception) {
      return new ResponseEntity<>("Order not found", HttpStatus.NOT_FOUND);
   }
}