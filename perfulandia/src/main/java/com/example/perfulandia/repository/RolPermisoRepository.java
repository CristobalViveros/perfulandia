package com.example.perfulandia.repository;
import com.example.perfulandia.model.RolPermiso;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface RolPermisoRepository extends JpaRepository <RolPermiso, Long> {
    List<RolPermiso> findByRolld(Long rolld);
    List<RolPermiso> findByPermisod(Long permisold);

    Optional<RolPermiso> findByRolldAndPermiso(Long rolld, Long permisold );

    boolean existsByRolldAndPermiso(Long rolld, Long Permisold);

    void deleteByRollAndPermiso(Long rolld, Long permisold);

}
