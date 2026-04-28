package com.example.perfulandia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.perfulandia.model.Inventario;

public interface InventarioRepository  extends JpaRepository<Inventario,Long>{
        List<Inventario> findBySucursalld(Long
            sucursalld);
        
    
}
