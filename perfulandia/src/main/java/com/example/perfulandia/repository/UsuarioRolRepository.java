package com.example.perfulandia.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.perfulandia.model.UsuarioRol;
import java.util.List;
import java.util.Optional;

public interface UsuarioRolRepository extends JpaRepository <UsuarioRol, Long> {
    List <UsuarioRol> findyByUsuario(Long usuarioid);

    List<UsuarioRol> findByRolld(Long rolld);

    Optional<UsuarioRol> findByUsuarioldAndRolld(Long usuarioid, Long roolld);
    boolean existsByUsuarioAndRolld(Long usuarioid, Long rolld);

    void deleteByUsuarioAndRolld(Long usuarioid, Long rolld); 

}
