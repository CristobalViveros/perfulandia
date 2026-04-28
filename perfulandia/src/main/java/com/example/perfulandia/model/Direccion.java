package com.example.perfulandia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "direcciones")
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "cliente_id", nullable = false,
            foreignKey = @ForeignKey(name="fk_direccion_cliente"))
    private Cliente cliente;

    @NotBlank
    @Column(nullable = false, length = 160)
    private String calle;

    @NotBlank
    @Column(nullable = false, length = 60)
    private String comuna;

    @NotBlank
    @Column(nullable = false, length = 60)
    private String ciudad;

    @Column(length = 60)
    private String region;

    @Column(nullable = false)
    private boolean principal = false;

}
