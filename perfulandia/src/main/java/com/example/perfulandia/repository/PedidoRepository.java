package com.example.perfulandia.repository;

import java.util.List;

public interface PedidoRepository  extends JpaRepository<Pedido,Long> {
    
        List<Pedido> finByClienteld(Long
            clienteld);
        
    

}
