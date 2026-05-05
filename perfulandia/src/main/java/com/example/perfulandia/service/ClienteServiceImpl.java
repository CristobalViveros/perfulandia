package com.example.perfulandia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.perfulandia.model.Cliente;
import com.example.perfulandia.repository.ClienteRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository repo;

    public ClienteServiceImpl(ClienteRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Cliente> listar() {
        return repo.findAll();
    }

    @Override
    public Cliente obtenerPorId(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
    }

    @Override
    public Cliente crear(Cliente c) {
        c.setId(null);
        return repo.save(c);
    }

    @Override
    public Cliente actualizar(Long id, Cliente cambios) {
        Cliente existente = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));

        // 🔧 AJUSTA estos campos según tu entidad Cliente
        existente.setNombre(cambios.getNombre());
        existente.setEmail(cambios.getEmail());
        existente.setTelefono(cambios.getTelefono());

        return repo.save(existente);
    }

    @Override
    public void eliminar(Long id) {
        if (!repo.existsById(id)) {
            throw new RuntimeException("Cliente no encontrado");
        }
        repo.deleteById(id);
    }
}