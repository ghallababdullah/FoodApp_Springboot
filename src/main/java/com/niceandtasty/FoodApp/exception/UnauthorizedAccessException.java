package com.niceandtasty.FoodApp.exception;

public class UnauthorizedAccessException extends RuntimeException{
    public UnauthorizedAccessException(String Message){
        super(Message);
    }
}
