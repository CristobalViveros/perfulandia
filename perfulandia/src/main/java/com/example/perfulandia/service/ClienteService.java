package com.example.perfulandia.service;

import com.example.perfulandia.model.Cliente;

public interface ClienteService {

    Cliente crear(Cliente cliente);
    Cliente obtenerPorId(Long id);

}
