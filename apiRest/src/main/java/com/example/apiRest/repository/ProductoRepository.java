package com.example.apiRest.repository;

import com.example.apiRest.producto.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

//Repositorio q maneja las operaciones crud de la entidad Producto
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}