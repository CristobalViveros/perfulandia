package com.example.perfulandia.repository;

import java.util.List;
import java.util.Optional;

public interface EmpleadoRepository extends JpaRepository <Empleado, Long> {
    Optional<Empleado> findByUusuariold(Long usuarioid);

    List<Empleado> findBySucursalld(Long sucursalld);

    List<Empleado> findBySucursalAndCargo(Long sucursalld, Cargo cargo);

    List<Empleado> findByCargo(Cargo cargo);

}
