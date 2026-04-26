package com.example.perfulandia.service;

import java.util.List;

import com.example.perfulandia.model.Usuario;

public interface UsuarioService {
    
    List<Usuario> listar();
    Usuario obtenerPorId(Long id);
    Usuario crear(Usuario usuario);
    Usuario actualizar(Long id, Usuario usuario);
    Usuario desactivar(Long id);

}
