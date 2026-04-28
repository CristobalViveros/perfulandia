package com.example.perfulandia.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.perfulandia.model.Pago;
import com.example.perfulandia.model.Pago.EstadoPago;
import com.example.perfulandia.model.Pago.Metodo;

public interface PagoRepository extends JpaRepository<Pago, Long> {

    Optional<Pago> findByPedidoId(Long pedidoId);

    List<Pago> findByEstado(EstadoPago estado);

    List<Pago> findByMetodo(Metodo metodo);

}
