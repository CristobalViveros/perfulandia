package com.example.perfulandia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.perfulandia.model.Rol;
import com.example.perfulandia.repository.RolRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class RolServiceImpl implements RolService{
    
    private final RolRepository repo;

    public RolServiceImpl(RolRepository repo) {
        this.repo = repo;
    }

    public List<Rol> listar() {
        return repo.findAll();
    }

    public Rol obtenerPorId(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Rol no encontrado"));
    }

    public Rol crear(Rol rol) {
        rol.setId(null);
        return repo.save(rol);
    }

}
