package com.example.perfulandia.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.perfulandia.model.Direccion;
import com.example.perfulandia.service.DireccionService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/direcciones")
public class DireccionController {

    private final DireccionService service;

    public DireccionController(DireccionService service) {
        this.service = service;
    }

    @GetMapping("/cliente/{clienteId}")
    public List<Direccion> listarPorCliente(@PathVariable Long clienteId) {
        return service.listarPorCliente(clienteId);
    }

    @PostMapping
    public ResponseEntity<Direccion> crear(
            @Valid @RequestBody Direccion direccion) {

        Direccion creada = service.crear(direccion);
        return ResponseEntity.status(201).body(creada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
