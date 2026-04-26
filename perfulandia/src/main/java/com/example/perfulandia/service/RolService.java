package com.example.perfulandia.service;

import java.util.List;

import com.example.perfulandia.model.Rol;

public interface RolService {

    List<Rol> listar();
    Rol obtenerPorId(Long id);
    Rol crear(Rol rol);

}
