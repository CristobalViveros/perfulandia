package com.example.perfulandia.service;

import org.springframework.stereotype.Service;

import com.example.perfulandia.model.Pedido;
import com.example.perfulandia.repository.PedidoRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PedidoServiceImpl implements PedidoService{

    private final PedidoRepository repo;

    public PedidoServiceImpl(PedidoRepository repo) {
        this.repo = repo;
    }

    public Pedido crear(Pedido p) {
        p.setId(null);
        p.setEstado(Pedido.EstadoPedido.CREADO);
        return repo.save(p);
    }

    public Pedido cambiarEstado(Long id, Pedido.EstadoPedido estado) {
        Pedido p = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Pedido no encontrado"));
        p.setEstado(estado);
        return repo.save(p);
    }

}
