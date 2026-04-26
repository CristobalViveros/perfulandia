package com.example.perfulandia.service;

import com.example.perfulandia.model.Pedido;

public interface PedidoService {

    Pedido crear(Pedido pedido);
    Pedido cambiarEstado(Long id, Pedido.EstadoPedido estado);

}
