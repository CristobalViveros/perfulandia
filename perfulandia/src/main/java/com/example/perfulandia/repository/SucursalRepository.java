package com.example.perfulandia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.perfulandia.model.Sucursal;
 
public interface SucursalRepository  extends JpaRepository <Sucursal, Long>{
    List<Sucursal> findbyNombreContaininglgnoreCase(String nombre);


}
