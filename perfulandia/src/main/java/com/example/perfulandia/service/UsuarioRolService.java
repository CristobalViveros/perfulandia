package com.example.perfulandia.service;

import com.example.perfulandia.model.UsuarioRol;

public interface UsuarioRolService {

    UsuarioRol asignarRol(UsuarioRol ur);
    void quitarRol(Long usuarioId, Long rolId);

}
