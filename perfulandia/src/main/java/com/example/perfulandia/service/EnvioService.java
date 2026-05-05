package com.example.perfulandia.service;

import com.example.perfulandia.model.Envio;

public interface EnvioService {

    Envio crear(Envio envio);
    Envio obtenerPorPedido(Long pedidoId);
    Envio obtenerPorTracking(String tracking);
    Envio cambiarEstado(Long id, Envio.EstadoEnvio estado);
}