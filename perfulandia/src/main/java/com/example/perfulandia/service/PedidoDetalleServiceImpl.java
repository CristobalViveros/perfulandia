package com.example.perfulandia.service;

import org.springframework.stereotype.Service;

import com.example.perfulandia.model.PedidoDetalle;
import com.example.perfulandia.repository.PedidoDetalleRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PedidoDetalleServiceImpl implements PedidoDetalleService {

    private final PedidoDetalleRepository repo;

    public PedidoDetalleServiceImpl(PedidoDetalleRepository repo) {
        this.repo = repo;
    }

    public PedidoDetalle agregarDetalle(PedidoDetalle d) {
        d.setId(null);
        return repo.save(d);
    }

}
