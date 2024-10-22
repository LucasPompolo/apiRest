package com.example.apiRest.producto;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "producto")
@Data
public class Producto {

    //Aca lleva la llave primaria q se autogenera
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Estos son los diferentes campos para los productos.
    private String nombre;
    private String descripcion;
    private double precio;
}