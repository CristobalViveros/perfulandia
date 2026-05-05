package com.example.perfulandia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.perfulandia.model.Pedido;

public interface PedidoRepository  extends JpaRepository<Pedido,Long> {
    
        List<Pedido> findByClienteId(Long
            clienteld);
        
    

}
