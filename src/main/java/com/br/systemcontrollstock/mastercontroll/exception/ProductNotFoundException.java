package com.br.systemcontrollstock.mastercontroll.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProductNotFoundException extends Exception{
    public ProductNotFoundException(String cause, String value) {
        super("Product with "+cause+": "+value+" not found");
    }
}
