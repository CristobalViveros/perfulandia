package com.example.perfulandia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.perfulandia.model.Pedido;
import com.example.perfulandia.repository.PedidoRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PedidoServiceImpl implements PedidoService {

    private final PedidoRepository repo;

    public PedidoServiceImpl(PedidoRepository repo) {
        this.repo = repo;
    }

    @Override
    public Pedido obtenerPorId(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Pedido no encontrado"));
    }

    @Override
    public List<Pedido> historialCliente(Long clienteId) {
        return repo.findByClienteId(clienteId);
    }

    @Override
    public Pedido crear(Pedido p) {
        p.setId(null);
        p.setEstado(Pedido.EstadoPedido.CREADO);
        return repo.save(p);
    }

    @Override
    public Pedido cambiarEstado(Long id, Pedido.EstadoPedido estado) {
        Pedido p = obtenerPorId(id);
        p.setEstado(estado);
        return repo.save(p);
    }
}
