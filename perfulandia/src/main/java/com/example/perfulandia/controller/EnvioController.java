package com.example.perfulandia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.perfulandia.model.Envio;
import com.example.perfulandia.service.EnvioService;

@RestController
@RequestMapping("/api/envios")
public class EnvioController {

    private final EnvioService service;

    public EnvioController(EnvioService service) {
        this.service = service;
    }

    @GetMapping("/pedido/{pedidoId}")
    public Envio obtenerPorPedido(@PathVariable Long pedidoId) {
        return service.obtenerPorPedido(pedidoId);
    }

    @GetMapping("/tracking/{tracking}")
    public Envio obtenerPorTracking(@PathVariable String tracking) {
        return service.obtenerPorTracking(tracking);
    }

    @PostMapping
    public Envio crear(@RequestBody Envio envio) {
        return service.crear(envio);
    }

    @PatchMapping("/{id}/estado")
    public Envio cambiarEstado(@PathVariable Long id, @RequestParam Envio.EstadoEnvio estado) {
        return service.cambiarEstado(id, estado);
    }

}
