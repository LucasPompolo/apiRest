package com.example.apiRest.controller;

import com.example.apiRest.exception.ProductoNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

//Esta clase maneja las excepciones globales q pueda tener la app //
@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

    //Metodo para manejar la excepciom ProductoNotFoundException //
    @ExceptionHandler(ProductoNotFoundException.class)
    public ResponseEntity<String> handleProductoNotFoundException(ProductoNotFoundException ex) {
        return new ResponseEntity<>("Producto no encontrado: " + ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    //metodo para manejar otras opciones generales //
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGeneralException(Exception ex) {
        //Indica un mensaje por si hay un algun error q no este especificado
        return new ResponseEntity<>("Error interno del servidor: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}