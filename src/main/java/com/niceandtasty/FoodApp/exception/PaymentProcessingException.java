package com.niceandtasty.FoodApp.exception;

public class PaymentProcessingException extends RuntimeException{
    public PaymentProcessingException (String Message){
        super(Message);
    }
}
