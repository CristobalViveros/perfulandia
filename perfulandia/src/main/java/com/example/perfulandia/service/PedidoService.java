package com.example.perfulandia.service;

import java.util.List;
import com.example.perfulandia.model.Pedido;

public interface PedidoService {

    Pedido obtenerPorId(Long id);

    List<Pedido> historialCliente(Long clienteId);

    Pedido crear(Pedido pedido);

    Pedido cambiarEstado(Long id, Pedido.EstadoPedido estado);
}