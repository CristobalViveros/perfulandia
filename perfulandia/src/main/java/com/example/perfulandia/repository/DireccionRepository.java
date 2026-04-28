package com.example.perfulandia.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.perfulandia.model.Direccion;

public interface DireccionRepository extends JpaRepository<Direccion, Long> {

    List<Direccion> findByClienteId(Long clienteId);
    Optional<Direccion> findByClienteIdAndPrincipalTrue(Long clienteId);

}
