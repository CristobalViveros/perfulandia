package com.example.perfulandia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.perfulandia.model.PedidoDetalle;

public interface PedidoDetalleRepository extends JpaRepository<PedidoDetalle, Long>  {
    
    List<PedidoDetalle> findByPedidoId(Long pedidoId);

    List<PedidoDetalle> findByProductoId(Long productoId);

    // útil para ver los items vendidos por sucursal si haces join por pedido.sucursal.id
    List<PedidoDetalle> findByPedidoSucursalId(Long sucursalId);

}
