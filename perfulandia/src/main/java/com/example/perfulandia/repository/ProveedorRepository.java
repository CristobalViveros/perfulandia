package com.example.perfulandia.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.perfulandia.model.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {

    Optional<Proveedor> findByRut(String rut);

    List<Proveedor> findByNombreContainingIgnoreCase(String nombre);

    boolean existsByRut(String rut);

}
