package com.example.perfulandia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.perfulandia.model.OrdenCompraDetalle;
import com.example.perfulandia.service.OrdenCompraDetalleService;

@RestController
@RequestMapping("/api/orden-compra-detalles")
public class OrdenCompraDetalleController {

    private final OrdenCompraDetalleService service;

    public OrdenCompraDetalleController(OrdenCompraDetalleService service) {
        this.service = service;
    }

    @GetMapping("/orden/{ordenCompraId}")
    public List<OrdenCompraDetalle> listarPorOrden(@PathVariable Long ordenCompraId) {
        return service.listarPorOrdenCompra(ordenCompraId);
    }

    @PostMapping
    public OrdenCompraDetalle crear(@RequestBody OrdenCompraDetalle detalle) {
        return service.crear(detalle);
    }

}
