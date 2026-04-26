package com.example.perfulandia.service;

import org.springframework.stereotype.Service;

import com.example.perfulandia.model.RolPermiso;
import com.example.perfulandia.repository.RolPermisoRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class RolPermisoServiceImpl implements RolPermisoService{
    
    private final RolPermisoRepository repo;

    public RolPermisoServiceImpl(RolPermisoRepository repo) {
        this.repo = repo;
    }

    public RolPermiso asignarPermiso(RolPermiso rp) {
        rp.setId(null);
        return repo.save(rp);
    }

}
