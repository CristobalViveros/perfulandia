package com.example.perfulandia.repository;

import java.util.List;

public interface InventarioRepository  extends JpaRepository<Inventario,Long>{
        List<Inventario> findBySucursalld(Long
            sucursalld);
        
    
}
