package com.example.perfulandia.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.perfulandia.model.Usuario;
import com.example.perfulandia.service.UsuarioService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @GetMapping
    public List<Usuario> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Usuario obtener(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    @PostMapping
    public ResponseEntity<Usuario> crear(@Valid @RequestBody Usuario usuario) {
        Usuario creado = service.crear(usuario);
        return ResponseEntity.status(201).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> actualizar(
            @PathVariable Long id,
            @Valid @RequestBody Usuario cambios) {

        Usuario actualizado = service.actualizar(id, cambios);
        return ResponseEntity.ok(actualizado);
    }

    @PatchMapping("/{id}/desactivar")
    public ResponseEntity<Usuario> desactivar(@PathVariable Long id) {
        Usuario actualizado = service.desactivar(id);
        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        service.desactivar(id);
        return ResponseEntity.noContent().build();
    }
}