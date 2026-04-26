package com.example.perfulandia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.perfulandia.model.Sucursal;
import com.example.perfulandia.repository.SucursalRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class SucursalServiceImpl implements SucursalService{
    
    private final SucursalRepository repo;

    public SucursalServiceImpl(SucursalRepository repo) {
        this.repo = repo;
    }

    public List<Sucursal> listar() {
        return repo.findAll();
    }

    public Sucursal crear(Sucursal s) {
        s.setId(null);
        return repo.save(s);
    }

}
