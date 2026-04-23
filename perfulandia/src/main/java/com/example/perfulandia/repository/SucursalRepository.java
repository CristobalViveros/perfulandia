package com.example.perfulandia.repository;

import java.util.List;
 
public interface SucursalRepository  extends JpaRepository <Sucursal, Long>{
    List<Sucursal> findbyNombreContaininglgnoreCase(String nombre);


}
