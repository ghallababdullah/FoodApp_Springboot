package com.niceandtasty.FoodApp.exception;

import com.niceandtasty.FoodApp.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Response<?>> handlAllUnkownExceptions(Exception ex){
        Response<?> response = Response.builder()
                .statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .message(ex.getMessage())
                .build() ;

        return new ResponseEntity<>(response,HttpStatus.INTERNAL_SERVER_ERROR);



    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Response<?>> handlNotFoundException(NotFoundException ex){
        Response<?> response = Response.builder()
                .statusCode(HttpStatus.NOT_FOUND.value())
                .message(ex.getMessage())
                .build() ;

        return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<Response<?>> handlBadRequestException(BadRequestException ex){
        Response<?> response = Response.builder()
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .message(ex.getMessage())
                .build() ;

        return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UnauthorizedAccessException.class)
    public ResponseEntity<Response<?>> handlUnauthorizedAccessException(UnauthorizedAccessException ex){
        Response<?> response = Response.builder()
                .statusCode(HttpStatus.UNAUTHORIZED.value())
                .message(ex.getMessage())
                .build() ;

        return new ResponseEntity<>(response,HttpStatus.UNAUTHORIZED);
    }


    @ExceptionHandler(PaymentProcessingException.class)
    public ResponseEntity<Response<?>> handlPaymentProcessingException(PaymentProcessingException ex){
        Response<?> response = Response.builder()
                .statusCode(HttpStatus.BAD_GATEWAY.value())
                .message(ex.getMessage())
                .build() ;

        return new ResponseEntity<>(response,HttpStatus.BAD_GATEWAY);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Response<?>> handlIllegalArgumentException(IllegalArgumentException ex){
        Response<?> response = Response.builder()
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .message(ex.getMessage())
                .build() ;

        return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
    }









}
