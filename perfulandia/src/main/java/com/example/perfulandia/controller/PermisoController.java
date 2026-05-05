package com.example.perfulandia.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.perfulandia.model.Permiso;
import com.example.perfulandia.service.PermisoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/permisos")
public class PermisoController {

    private final PermisoService service;

    public PermisoController(PermisoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Permiso> listar() {
        return service.listar();
    }

    @PostMapping
    public ResponseEntity<Permiso> crear(@Valid @RequestBody Permiso permiso) {
        Permiso creado = service.crear(permiso);
        return ResponseEntity.status(201).body(creado);
    }
}