package com.example.perfulandia.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "envios")
public class Envio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(optional = false)
    @JoinColumn(name = "pedido_id", nullable = false, unique = true,
            foreignKey = @ForeignKey(name="fk_envio_pedido"))
    private Pedido pedido;

    @ManyToOne(optional = false)
    @JoinColumn(name = "direccion_id", nullable = false,
            foreignKey = @ForeignKey(name="fk_envio_direccion"))
    private Direccion direccionEnvio;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 30)
    private EstadoEnvio estado = EstadoEnvio.PROCESANDO;

    @Column(length = 80)
    private String tracking;

    private LocalDateTime fechaDespacho;
    private LocalDateTime fechaEntrega;

    public enum EstadoEnvio { PROCESANDO, EN_RUTA, ENTREGADO, DEVUELTO }

}
