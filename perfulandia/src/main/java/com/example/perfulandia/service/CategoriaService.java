package com.example.perfulandia.service;

import java.util.List;
import com.example.perfulandia.model.Categoria;

public interface CategoriaService {

    List<Categoria> listar();
    Categoria crear(Categoria categoria);
    void eliminar(Long id); 
}
