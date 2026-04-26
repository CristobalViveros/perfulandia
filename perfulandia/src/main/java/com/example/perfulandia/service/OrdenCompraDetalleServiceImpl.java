package com.example.perfulandia.service;

import org.springframework.stereotype.Service;

import com.example.perfulandia.model.OrdenCompraDetalle;
import com.example.perfulandia.repository.OrdenCompraDetalleRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class OrdenCompraDetalleServiceImpl {

    private final OrdenCompraDetalleRepository repo;

    public OrdenCompraDetalleServiceImpl(OrdenCompraDetalleRepository repo) {
        this.repo = repo;
    }

    public OrdenCompraDetalle crear(OrdenCompraDetalle d) {
        d.setId(null);
        return repo.save(d);
    }

}
