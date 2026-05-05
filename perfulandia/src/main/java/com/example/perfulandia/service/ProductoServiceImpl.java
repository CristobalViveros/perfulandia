package com.example.perfulandia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.perfulandia.model.Producto;
import com.example.perfulandia.repository.ProductoRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository repo;

    public ProductoServiceImpl(ProductoRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Producto> listar() {
        return repo.findAll();
    }

    @Override
    public Producto obtenerPorId(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
    }

    @Override
    public Producto crear(Producto p) {
        p.setId(null);
        p.setActivo(true);
        return repo.save(p);
    }


    @Override
    public Producto actualizar(Long id, Producto cambios) {
        Producto existente = obtenerPorId(id);

        existente.setNombre(cambios.getNombre());
        existente.setDescripcion(cambios.getDescripcion());
        existente.setPrecio(cambios.getPrecio());
        existente.setCategoria(cambios.getCategoria());
        existente.setActivo(cambios.isActivo());

        return repo.save(existente);
    }


    @Override
    public void eliminar(Long id) {
        if (!repo.existsById(id)) {
            throw new RuntimeException("Producto no encontrado");
        }
        repo.deleteById(id);
    }
}