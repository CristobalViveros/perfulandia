package com.example.perfulandia.service;

import java.util.List;
import com.example.perfulandia.model.OrdenCompraDetalle;

public interface OrdenCompraDetalleService {

    OrdenCompraDetalle crear(OrdenCompraDetalle detalle);

    List<OrdenCompraDetalle> listarPorOrdenCompra(Long ordenCompraId);
}
