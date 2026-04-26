package com.example.perfulandia.service;

import com.example.perfulandia.model.UsuarioRol;
import com.example.perfulandia.repository.UsuarioRolRepository;

public class UsuarioRolServiceImpl implements UsuarioRolService  {

    private final UsuarioRolRepository repo;

    public UsuarioRolServiceImpl(UsuarioRolRepository repo) {
        this.repo = repo;
    }

    public UsuarioRol asignarRol(UsuarioRol ur) {
        ur.setId(null);
        return repo.save(ur);
    }

    public void quitarRol(Long usuarioId, Long rolId) {
        repo.deleteByUsuarioAndRolld(usuarioId, rolId);
    }

}
