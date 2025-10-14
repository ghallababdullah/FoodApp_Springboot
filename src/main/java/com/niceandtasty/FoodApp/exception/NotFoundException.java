package com.niceandtasty.FoodApp.exception;

import org.aspectj.bridge.IMessage;

public class NotFoundException extends RuntimeException {

    public NotFoundException (String message){
        super(message);
    }
}
