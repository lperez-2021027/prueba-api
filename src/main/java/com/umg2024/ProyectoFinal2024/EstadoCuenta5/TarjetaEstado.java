package com.umg2024.ProyectoFinal2024.EstadoCuenta5;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Tarjeta")
public class TarjetaEstado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tarjeta_id;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal saldoActual;

    // Otros campos y getters/setters

    public Integer getTarjeta_id() {
        return tarjeta_id;
    }

    public void setTarjeta_id(Integer tarjeta_id) {
        this.tarjeta_id = tarjeta_id;
    }

    public BigDecimal getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(BigDecimal saldoActual) {
        this.saldoActual = saldoActual;
    }
}