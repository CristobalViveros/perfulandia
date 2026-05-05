package com.example.perfulandia.service;

import org.springframework.stereotype.Service;

import com.example.perfulandia.model.Envio;
import com.example.perfulandia.repository.EnvioRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EnvioServiceImpl implements EnvioService {

    private final EnvioRepository repo;

    public EnvioServiceImpl(EnvioRepository repo) {
        this.repo = repo;
    }

    @Override
    public Envio crear(Envio e) {
        e.setId(null);
        e.setEstado(Envio.EstadoEnvio.PROCESANDO);
        return repo.save(e);
    }

    @Override
    public Envio obtenerPorPedido(Long pedidoId) {
        return repo.findByPedidoId(pedidoId)
                .orElseThrow(() -> new RuntimeException("Envío no encontrado para el pedido"));
    }

    @Override
    public Envio obtenerPorTracking(String tracking) {
        return repo.findByTracking(tracking)
                .orElseThrow(() -> new RuntimeException("Envío no encontrado con tracking"));
    }

    @Override
    public Envio cambiarEstado(Long id, Envio.EstadoEnvio estado) {
        Envio envio = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Envío no encontrado"));

        envio.setEstado(estado);
        return repo.save(envio);
    }
}
