package com.example.perfulandia.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


import lombok.*; 

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "permisos")

public class Permiso {

    @Id
    @GeneratedValues(Strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false, unique = true, length = 80)
    private String codigo; // ej "INVENTARIO_EDITAR","USUARIOS_GESTIONAR"
     
    @Column(length = 200)
    private String descripcion;

}
