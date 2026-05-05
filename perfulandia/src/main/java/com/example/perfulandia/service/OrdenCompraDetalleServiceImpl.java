package com.example.perfulandia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.perfulandia.model.OrdenCompraDetalle;
import com.example.perfulandia.repository.OrdenCompraDetalleRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class OrdenCompraDetalleServiceImpl
        implements OrdenCompraDetalleService {

    private final OrdenCompraDetalleRepository repo;

    public OrdenCompraDetalleServiceImpl(OrdenCompraDetalleRepository repo) {
        this.repo = repo;
    }

    @Override
    public OrdenCompraDetalle crear(OrdenCompraDetalle d) {
        d.setId(null);
        return repo.save(d);
    }

    @Override
    public List<OrdenCompraDetalle> listarPorOrdenCompra(Long ordenCompraId) {
        return repo.findByOrdenCompraId(ordenCompraId);
    }
}