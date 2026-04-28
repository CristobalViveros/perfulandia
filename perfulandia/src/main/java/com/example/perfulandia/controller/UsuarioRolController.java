package com.example.perfulandia.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.perfulandia.model.UsuarioRol;
import com.example.perfulandia.service.UsuarioRolService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/usuario-roles")
public class UsuarioRolController {

    private final UsuarioRolService service;

    public UsuarioRolController(UsuarioRolService service) {
        this.service = service;
    }

    @PostMapping
    public UsuarioRol asignarRol(@RequestBody UsuarioRol ur) {
        return service.asignarRol(ur);
    }

    @DeleteMapping
    public ResponseEntity<Void> quitarRol(@RequestParam Long usuarioId, @RequestParam Long rolId) {
        service.quitarRol(usuarioId, rolId);
        return ResponseEntity.noContent().build();
    }

}
