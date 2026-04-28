package com.example.perfulandia.repository;

import java.util.List;
import java.util.Optional;

import com.example.perfulandia.model.Empleado;
import com.example.perfulandia.model.Empleado.Cargo;

public interface EmpleadoRepository {

    Optional<Empleado> findByUsuarioId(Long usuarioId);

    List<Empleado> findBySucursalId(Long sucursalId);

    List<Empleado> findBySucursalIdAndCargo(Long sucursalId, Cargo cargo);

    List<Empleado> findByCargo(Cargo cargo);

}
