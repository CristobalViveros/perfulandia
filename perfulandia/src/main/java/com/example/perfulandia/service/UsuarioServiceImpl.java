package com.example.perfulandia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.perfulandia.model.Usuario;
import com.example.perfulandia.repository.UsuarioRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService{

    private final UsuarioRepository repo;

    public UsuarioServiceImpl(UsuarioRepository repo) {
        this.repo = repo;
    }

    public List<Usuario> listar() {
        return repo.findAll();
    }

    public Usuario obtenerPorId(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }

    public Usuario crear(Usuario usuario) {
        usuario.setId(null);
        usuario.setActivo(true);
        return repo.save(usuario);
    }

    public Usuario actualizar(Long id, Usuario cambios) {
        Usuario u = obtenerPorId(id);
        u.setNombre(cambios.getNombre());
        u.setEmail(cambios.getEmail());
        return repo.save(u);
    }

    public Usuario desactivar(Long id) {
        Usuario u = obtenerPorId(id);
        u.setActivo(false);
        return repo.save(u);
    }

}
