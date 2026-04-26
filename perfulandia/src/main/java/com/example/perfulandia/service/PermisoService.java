package com.example.perfulandia.service;

import java.util.List;

import com.example.perfulandia.model.Permiso;

public interface PermisoService {

    List<Permiso> listar();
    Permiso crear(Permiso permiso);

}
