package com.example.perfulandia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "rol_permisos",
       uniqueConstraints = @UniqueConstraint(columnNames = {"rol_id", "permiso_id"}))

public class RolPermiso {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "rol_id", nullable = false, foreignKey = @ForeignKey(name="fk_rp_rol"))
    private Rol rol;

    @ManyToOne(optional = false)
    @JoinColumn(name = "permiso_id", nullable = false, foreignKey = @ForeignKey(name="fk_rp_permiso"))
    private Permiso permiso;

}
