package com.example.perfulandia.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.ForeignKey;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ordenes_compra")
public class OrdenCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "sucursal_id", nullable = false,
            foreignKey = @ForeignKey(name="fk_oc_sucursal"))
    private Sucursal sucursal;

    @ManyToOne(optional = false)
    @JoinColumn(name = "proveedor_id", nullable = false,
            foreignKey = @ForeignKey(name="fk_oc_proveedor"))
    private Proveedor proveedor;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private EstadoOC estado = EstadoOC.CREADA;

    @Column(nullable = false)
    private LocalDateTime fecha = LocalDateTime.now();

    public enum EstadoOC { CREADA, ENVIADA, RECIBIDA, CANCELADA }

}
