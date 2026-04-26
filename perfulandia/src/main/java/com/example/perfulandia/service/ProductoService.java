package com.example.perfulandia.service;

import java.util.List;

import com.example.perfulandia.model.Producto;

public interface ProductoService {

    List<Producto> listar();
    Producto crear(Producto producto);

}
