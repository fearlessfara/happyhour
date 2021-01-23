package com.faraone.happyhour.happyhour.service.security;

public class TokenVerificationException extends RuntimeException {
    public TokenVerificationException(Throwable t) {
        super(t);
    }
}