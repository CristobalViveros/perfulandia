package com.example.perfulandia.repository;
import com.example.perfulandia.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PermisoRepository extends JpaRepository<Permiso, Long> {
    Opcional<Permiso> findByCodigo(String codigo);
    boolean existsByCodigo(String codigo);

}
