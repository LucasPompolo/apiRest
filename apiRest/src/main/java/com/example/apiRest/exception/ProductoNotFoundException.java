package com.example.apiRest.exception;

//Excepcion q se usa cuando no se encuentra un producto

public class ProductoNotFoundException extends RuntimeException {
    public ProductoNotFoundException(String mensaje) {
        super(mensaje);
    }
}