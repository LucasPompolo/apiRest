package com.example.apiRest.service;

import com.example.apiRest.producto.Producto;
import java.util.List;

//Interfaz del servicio q define las operaciones crud para Producto
public interface ProductoService {

    //Metodo q obtiene todos los productos
    List<Producto> getAllProductos();

    //Metodo q obtiene un producto especifico por su ID
    Producto getProductoById(Long id);

    //Metodo q crea un producto nuevo
    Producto createProducto(Producto producto);

    //Metodo q actualiza un producto q ya existe por su ID
    Producto updateProducto(Long id, Producto productoActualizado);

    //Metodo q elimina un producto por su ID
    void deleteProducto(Long id);
}