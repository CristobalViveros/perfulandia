package com.example.perfulandia.service;

import java.util.List;
import com.example.perfulandia.model.OrdenCompra;

public interface OrdenCompraService {

    OrdenCompra crear(OrdenCompra oc);

    OrdenCompra obtenerPorId(Long id);

    List<OrdenCompra> listarPorSucursal(Long sucursalId);

    OrdenCompra cambiarEstado(Long id, OrdenCompra.EstadoOC estado);
}