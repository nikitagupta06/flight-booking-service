package com.nikitagupta06.flightservice.exception;

public class InsufficientAmountException extends RuntimeException {
    public InsufficientAmountException(String message) {
        super(message);
    }
}
