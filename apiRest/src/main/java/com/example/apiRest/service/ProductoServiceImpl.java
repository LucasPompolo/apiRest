package com.example.apiRest.service;

import com.example.apiRest.producto.Producto;
import com.example.apiRest.exception.ProductoNotFoundException;
import com.example.apiRest.repository.ProductoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

//Implementacion del servcio de Producto
@Service
@RequiredArgsConstructor
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository productoRepository;

    @Override
    public List<Producto> getAllProductos() {
        //Obtiene todos los productos del repositorio
        return productoRepository.findAll();
    }

    @Override
    public Producto getProductoById(Long id) {
        //Obtiene un producto por su ID o lanza una excepcion si no lo encuentra
        return productoRepository.findById(id)
                .orElseThrow(() -> new ProductoNotFoundException("Producto con ID " + id + " no encontrado"));
    }

    @Override
    public Producto createProducto(Producto producto) {
        //Guarda un producto nuevo en el repositorio
        return productoRepository.save(producto);
    }

    @Override
    public Producto updateProducto(Long id, Producto productoActualizado) {
        //Actualiza un producto existente
        return productoRepository.save(productoActualizado);
    }

    @Override
    public void deleteProducto(Long id) {
        //Elimina el producto por su ID
        productoRepository.deleteById(id);
    }
}