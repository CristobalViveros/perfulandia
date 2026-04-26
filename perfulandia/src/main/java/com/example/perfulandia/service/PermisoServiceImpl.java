package com.example.perfulandia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.perfulandia.model.Permiso;
import com.example.perfulandia.repository.PermisoRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PermisoServiceImpl implements PermisoService {
    
    private final PermisoRepository repo;

    public PermisoServiceImpl(PermisoRepository repo) {
        this.repo = repo;
    }

    public List<Permiso> listar() {
        return repo.findAll();
    }

    public Permiso crear(Permiso permiso) {
        permiso.setId(null);
        return repo.save(permiso);
    }

}
