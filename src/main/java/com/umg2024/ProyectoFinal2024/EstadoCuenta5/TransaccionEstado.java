package com.umg2024.ProyectoFinal2024.EstadoCuenta5;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "Transaccion")
public class TransaccionEstado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transaccion_id;

    @Column(nullable = false)
    private Integer tarjetaId;

    @Column(nullable = false)
    private String tipo;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal monto;

    @Column(nullable = false)
    private LocalDate fecha;

    // Getters y setters

    public Integer getTransaccion_id() {
        return transaccion_id;
    }

    public void setTransaccion_id(Integer transaccion_id) {
        this.transaccion_id = transaccion_id;
    }

    public Integer getTarjetaId() {
        return tarjetaId;
    }

    public void setTarjetaId(Integer tarjetaId) {
        this.tarjetaId = tarjetaId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}