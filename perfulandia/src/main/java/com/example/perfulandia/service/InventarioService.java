package com.example.perfulandia.service;

import java.util.List;

import com.example.perfulandia.model.Inventario;

public interface InventarioService {

    List<Inventario> verPorSucursal(Long sucursalId);
    Inventario ajustarStock(Long id, int delta);

}
