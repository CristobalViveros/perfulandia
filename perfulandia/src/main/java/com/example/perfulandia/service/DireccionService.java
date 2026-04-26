package com.example.perfulandia.service;

import java.util.List;

import com.example.perfulandia.model.Direccion;

public interface DireccionService {

    Direccion crear(Direccion direccion);
    List<Direccion> listarPorCliente(Long clienteId);

}
