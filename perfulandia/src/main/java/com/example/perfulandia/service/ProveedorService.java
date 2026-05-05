package com.example.perfulandia.service;

import java.util.List;
import com.example.perfulandia.model.Proveedor;

public interface ProveedorService {

    List<Proveedor> listar();

    Proveedor crear(Proveedor proveedor);

    void eliminar(Long id);
}