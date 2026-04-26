package com.example.perfulandia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.perfulandia.model.Inventario;
import com.example.perfulandia.repository.InventarioRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class InventarioServiceImpl implements InventarioService{

    private final InventarioRepository repo;

    public InventarioServiceImpl(InventarioRepository repo) {
        this.repo = repo;
    }

    public List<Inventario> verPorSucursal(Long sucursalId) {
        return repo.findBySucursalld(sucursalId);
    }

    public Inventario ajustarStock(Long id, int delta) {
        Inventario inv = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Inventario no encontrado"));
        inv.setStock(inv.getStock() + delta);
        return repo.save(inv);
    }

}
