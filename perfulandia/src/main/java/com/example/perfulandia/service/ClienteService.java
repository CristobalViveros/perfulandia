package com.example.perfulandia.service;

import java.util.List;
import com.example.perfulandia.model.Cliente;

public interface ClienteService {

    List<Cliente> listar();
    Cliente obtenerPorId(Long id);
    Cliente crear(Cliente cliente);
    Cliente actualizar(Long id, Cliente cambios);
    void eliminar(Long id);
}