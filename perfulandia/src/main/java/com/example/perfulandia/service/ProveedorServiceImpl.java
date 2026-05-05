package com.example.perfulandia.service;

import java.util.List;

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

    @Override
    public List<Proveedor> listar() {
        return repo.findAll();
    }

    @Override
    public Proveedor crear(Proveedor p) {
        p.setId(null);
        return repo.save(p);
    }

    @Override
    public void eliminar(Long id) {
        if (!repo.existsById(id)) {
            throw new RuntimeException("Proveedor no encontrado");
        }
        repo.deleteById(id);
    }
}
