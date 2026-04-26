package com.example.perfulandia.service;

import org.springframework.stereotype.Service;

import com.example.perfulandia.model.Envio;
import com.example.perfulandia.repository.EnvioRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EnvioServiceImpl implements EnvioService{
    
    private final EnvioRepository repo;

    public EnvioServiceImpl(EnvioRepository repo) {
        this.repo = repo;
    }

    public Envio crear(Envio e) {
        e.setId(null);
        e.setEstado(Envio.EstadoEnvio.PROCESANDO);
        return repo.save(e);
    }

}
