package com.example.perfulandia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.perfulandia.model.Categoria;
import com.example.perfulandia.repository.CategoriaRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CategoriaServiceImpl implements CategoriaService{
    
    private final CategoriaRepository repo;

    public CategoriaServiceImpl(CategoriaRepository repo) {
        this.repo = repo;
    }

    public List<Categoria> listar() {
        return repo.findAll();
    }

    public Categoria crear(Categoria c) {
        c.setId(null);
        return repo.save(c);
    }

}
