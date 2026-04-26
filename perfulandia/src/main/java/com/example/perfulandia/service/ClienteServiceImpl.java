package com.example.perfulandia.service;

import org.springframework.stereotype.Service;

import com.example.perfulandia.model.Cliente;
import com.example.perfulandia.repository.ClienteRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ClienteServiceImpl implements ClienteService{

    private final ClienteRepository repo;

    public ClienteServiceImpl(ClienteRepository repo) {
        this.repo = repo;
    }

    public Cliente crear(Cliente c) {
        c.setId(null);
        return repo.save(c);
    }

    public Cliente obtenerPorId(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
    }

}
