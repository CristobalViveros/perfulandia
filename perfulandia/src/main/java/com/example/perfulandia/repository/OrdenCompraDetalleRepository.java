package com.example.perfulandia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.perfulandia.model.OrdenCompraDetalle;

public interface OrdenCompraDetalleRepository extends JpaRepository<OrdenCompraDetalle, Long> {

    List<OrdenCompraDetalle> findByOrdenCompraId(Long ordenCompraId);

    List<OrdenCompraDetalle> findByProductoId(Long productoId);

    // para ver detalle por proveedor (pasa por ordenCompra.proveedor.id)
    List<OrdenCompraDetalle> findByOrdenCompraProveedorId(Long proveedorId);

}
