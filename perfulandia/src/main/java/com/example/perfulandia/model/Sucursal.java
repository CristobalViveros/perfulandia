package com.example.perfulandia.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import javax.annotation.processing.Generated;
import lombok; 

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "sucursales") 

public class Sucursal {
    @id
    @GeneratedValues(Strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false, length = 80)
    private String nombre;

    @NotBlank
    @Column(nullable = false, length = 180)
    private String direccion;

    @Column(length = 60)
    private String horario;

}
