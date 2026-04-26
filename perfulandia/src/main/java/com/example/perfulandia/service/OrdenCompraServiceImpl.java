package com.example.perfulandia.service;

import org.springframework.stereotype.Service;

import com.example.perfulandia.model.OrdenCompra;
import com.example.perfulandia.repository.OrdenCompraRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class OrdenCompraServiceImpl implements OrdenCompraService{
    
    private final OrdenCompraRepository repo;

    public OrdenCompraServiceImpl(OrdenCompraRepository repo) {
        this.repo = repo;
    }

    public OrdenCompra crear(OrdenCompra oc) {
        oc.setId(null);
        oc.setEstado(OrdenCompra.EstadoOC.CREADA);
        return repo.save(oc);
    }

}
