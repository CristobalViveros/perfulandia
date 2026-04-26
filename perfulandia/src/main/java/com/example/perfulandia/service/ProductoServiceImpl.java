package com.example.perfulandia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.perfulandia.model.Producto;
import com.example.perfulandia.repository.ProductoRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductoServiceImpl implements ProductoService{

    private final ProductoRepository repo;

    public ProductoServiceImpl(ProductoRepository repo) {
        this.repo = repo;
    }

    public List<Producto> listar() {
        return repo.findAll();
    }

    public Producto crear(Producto p) {
        p.setId(null);
        p.setActivo(true);
        return repo.save(p);
    }

}
