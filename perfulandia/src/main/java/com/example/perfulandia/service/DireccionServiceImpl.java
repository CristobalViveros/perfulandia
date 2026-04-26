package com.example.perfulandia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.perfulandia.model.Direccion;
import com.example.perfulandia.repository.DireccionRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class DireccionServiceImpl implements DireccionService {

    private final DireccionRepository repo;

    public DireccionServiceImpl(DireccionRepository repo) {
        this.repo = repo;
    }

    public Direccion crear(Direccion d) {
        d.setId(null);
        return repo.save(d);
    }

    public List<Direccion> listarPorCliente(Long clienteId) {
        return repo.findByClienteId(clienteId);
    }

}
