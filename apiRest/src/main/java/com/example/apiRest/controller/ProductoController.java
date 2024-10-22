package com.example.apiRest.controller;

import com.example.apiRest.producto.Producto;
import com.example.apiRest.service.ProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/producto")
@RequiredArgsConstructor
public class ProductoController {

    //Inyecta dependencias para ProductoService

    private final ProductoService productoService;

    //Metodo para poder obtener todos los productos
    @GetMapping
    public List<Producto> getAllProducto() {
        return productoService.getAllProductos();
    }
}