package com.example.perfulandia.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.perfulandia.model.RolPermiso;
import com.example.perfulandia.service.RolPermisoService;

@RestController
@RequestMapping("/api/rol-permisos")
public class RolPermisoController {

    private final RolPermisoService service;

    public RolPermisoController(RolPermisoService service) {
        this.service = service;
    }

    @PostMapping
    public RolPermiso asignarPermiso(@RequestBody RolPermiso rp) {
        return service.asignarPermiso(rp);
    }

}
