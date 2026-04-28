package com.example.perfulandia.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.perfulandia.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

    Optional<Cliente> findByEmail(String email);
    boolean existsByEmail(String email);

    List<Cliente> findByNombreContainingIgnoreCase(String nombre);

}
