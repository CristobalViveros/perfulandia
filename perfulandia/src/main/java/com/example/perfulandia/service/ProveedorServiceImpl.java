package com.example.perfulandia.service;

import org.springframework.stereotype.Service;

import com.example.perfulandia.model.Proveedor;
import com.example.perfulandia.repository.ProveedorRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProveedorServiceImpl implements ProveedorService {

    private final ProveedorRepository repo;

    public ProveedorServiceImpl(ProveedorRepository repo) {
        this.repo = repo;
    }

    public Proveedor crear(Proveedor p) {
        p.setId(null);
        return repo.save(p);
    }

}
