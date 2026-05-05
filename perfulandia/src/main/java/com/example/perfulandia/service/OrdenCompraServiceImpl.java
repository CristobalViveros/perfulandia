package com.example.perfulandia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.perfulandia.model.OrdenCompra;
import com.example.perfulandia.repository.OrdenCompraRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class OrdenCompraServiceImpl implements OrdenCompraService {

    private final OrdenCompraRepository repo;

    public OrdenCompraServiceImpl(OrdenCompraRepository repo) {
        this.repo = repo;
    }

    @Override
    public OrdenCompra crear(OrdenCompra oc) {
        oc.setId(null);
        oc.setEstado(OrdenCompra.EstadoOC.CREADA);
        return repo.save(oc);
    }

    @Override
    public OrdenCompra obtenerPorId(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Orden de compra no encontrada"));
    }

    @Override
    public List<OrdenCompra> listarPorSucursal(Long sucursalId) {
        return repo.findBySucursalId(sucursalId);
    }

    @Override
    public OrdenCompra cambiarEstado(Long id, OrdenCompra.EstadoOC estado) {
        OrdenCompra oc = obtenerPorId(id);
        oc.setEstado(estado);
        return repo.save(oc);
    }
}