package com.example.perfulandia.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.perfulandia.model.OrdenCompra;
import com.example.perfulandia.service.OrdenCompraService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/ordenes-compra")
public class OrdenCompraController {

    private final OrdenCompraService service;

    public OrdenCompraController(OrdenCompraService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public OrdenCompra obtener(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    @GetMapping("/sucursal/{sucursalId}")
    public List<OrdenCompra> listarPorSucursal(@PathVariable Long sucursalId) {
        return service.listarPorSucursal(sucursalId);
    }

    @PostMapping
    public ResponseEntity<OrdenCompra> crear(@Valid @RequestBody OrdenCompra oc) {
        OrdenCompra creada = service.crear(oc);
        return ResponseEntity.status(201).body(creada);
    }

    @PatchMapping("/{id}/estado")
    public ResponseEntity<OrdenCompra> cambiarEstado(
            @PathVariable Long id,
            @RequestParam OrdenCompra.EstadoOC estado) {

        OrdenCompra actualizada = service.cambiarEstado(id, estado);
        return ResponseEntity.ok(actualizada);
    }
}