package com.example.perfulandia.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.perfulandia.model.OrdenCompra;
import com.example.perfulandia.model.OrdenCompra.EstadoOC;

public interface OrdenCompraRepository extends JpaRepository<OrdenCompra, Long> {

    List<OrdenCompra> findBySucursalId(Long sucursalId);

    List<OrdenCompra> findByProveedorId(Long proveedorId);

    List<OrdenCompra> findByEstado(EstadoOC estado);

    List<OrdenCompra> findBySucursalIdAndEstado(Long sucursalId, EstadoOC estado);

    List<OrdenCompra> findByFechaBetween(LocalDateTime desde, LocalDateTime hasta);

}
