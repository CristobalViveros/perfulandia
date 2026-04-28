package com.example.perfulandia.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.perfulandia.model.Envio;
import com.example.perfulandia.model.Envio.EstadoEnvio;

public interface EnvioRepository extends JpaRepository<Envio, Long>{

    Optional<Envio> findByPedidoId(Long pedidoId);

    List<Envio> findByEstado(EstadoEnvio estado);

    List<Envio> findByDireccionEnvioClienteId(Long clienteId);

    Optional<Envio> findByTracking(String tracking);

}
