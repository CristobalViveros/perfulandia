package com.example.perfulandia.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.perfulandia.model.UsuarioRol;
import com.example.perfulandia.service.UsuarioRolService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/usuario-roles")
public class UsuarioRolController {

    private final UsuarioRolService service;

    public UsuarioRolController(UsuarioRolService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<UsuarioRol> asignarRol(@Valid @RequestBody UsuarioRol ur) {
        UsuarioRol creado = service.asignarRol(ur);
        return ResponseEntity.status(201).body(creado);
    }

    @DeleteMapping
    public ResponseEntity<Void> quitarRol(
            @RequestParam Long usuarioId,
            @RequestParam Long rolId) {

        service.quitarRol(usuarioId, rolId);
        return ResponseEntity.noContent().build();
    }
}