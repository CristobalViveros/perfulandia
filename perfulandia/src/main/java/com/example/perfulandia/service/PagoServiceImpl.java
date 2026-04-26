package com.example.perfulandia.service;

import org.springframework.stereotype.Service;

import com.example.perfulandia.model.Pago;
import com.example.perfulandia.repository.PagoRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PagoServiceImpl implements PagoService {

    private final PagoRepository repo;

    public PagoServiceImpl(PagoRepository repo) {
        this.repo = repo;
    }

    public Pago crear(Pago p) {
        p.setId(null);
        return repo.save(p);
    }

}
