package com.example.perfulandia.service;

import java.util.List;

import com.example.perfulandia.model.Empleado;

public interface EmpleadoService {

    List<Empleado> listarPorSucursal(Long sucursalId);
    Empleado crear(Empleado empleado);

}
