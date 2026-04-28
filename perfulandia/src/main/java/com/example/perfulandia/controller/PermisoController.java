package com.example.perfulandia.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.perfulandia.model.Permiso;
import com.example.perfulandia.service.PermisoService;

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
    public Permiso crear(@RequestBody Permiso permiso) {
        return service.crear(permiso);
    }

}
