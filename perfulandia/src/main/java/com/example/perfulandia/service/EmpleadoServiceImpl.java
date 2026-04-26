package com.example.perfulandia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.perfulandia.model.Empleado;
import com.example.perfulandia.repository.EmpleadoRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmpleadoServiceImpl implements EmpleadoService {

    private final EmpleadoRepository repo;

    public EmpleadoServiceImpl(EmpleadoRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Empleado> listarPorSucursal(Long sucursalId) {
        return repo.findBySucursalId(sucursalId);
    }

    @Override
    public Empleado crear (Empleado e) {
        e.setId(null);
        return repo.save(e);
    }    

}
