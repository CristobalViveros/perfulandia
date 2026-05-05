package com.example.perfulandia.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.perfulandia.model.Inventario;
import com.example.perfulandia.service.InventarioService;

@RestController
@RequestMapping("/api/inventario")
public class InventarioController {

    private final InventarioService service;

    public InventarioController(InventarioService service) {
        this.service = service;
    }

    @GetMapping("/sucursal/{sucursalId}")
    public List<Inventario> verPorSucursal(@PathVariable Long sucursalId) {
        return service.verPorSucursal(sucursalId);
    }

    @PatchMapping("/{id}/ajustar")
    public ResponseEntity<Inventario> ajustar(
            @PathVariable Long id,
            @RequestParam int delta) {

        Inventario actualizado = service.ajustarStock(id, delta);
        return ResponseEntity.ok(actualizado);
    }
}