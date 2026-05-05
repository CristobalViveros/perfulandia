package com.example.perfulandia.service;

import java.util.List;
import com.example.perfulandia.model.Producto;

public interface ProductoService {

    List<Producto> listar();

    Producto obtenerPorId(Long id);

    Producto crear(Producto producto);

    Producto actualizar(Long id, Producto cambios);

    void eliminar(Long id);
}