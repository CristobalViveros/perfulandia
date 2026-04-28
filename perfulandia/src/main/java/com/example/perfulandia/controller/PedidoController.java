package com.example.perfulandia.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.perfulandia.model.Pedido;
import com.example.perfulandia.service.PedidoService;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    private final PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Pedido obtener(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    @GetMapping("/cliente/{clienteId}")
    public List<Pedido> historial(@PathVariable Long clienteId) {
        return service.historialCliente(clienteId);
    }

    @PostMapping
    public Pedido crear(@RequestBody Pedido pedido) {
        return service.crear(pedido);
    }

    @PatchMapping("/{id}/estado")
    public Pedido cambiarEstado(@PathVariable Long id, @RequestParam Pedido.EstadoPedido estado) {
        return service.cambiarEstado(id, estado);
    }

}
