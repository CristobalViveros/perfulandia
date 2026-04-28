package com.example.perfulandia.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.perfulandia.model.Empleado;
import com.example.perfulandia.model.Empleado.Cargo;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

    Optional<Empleado> findByUsuarioId(Long usuarioId);

    List<Empleado> findBySucursalId(Long sucursalId);

    List<Empleado> findBySucursalIdAndCargo(Long sucursalId, Cargo cargo);

    List<Empleado> findByCargo(Cargo cargo);

}
