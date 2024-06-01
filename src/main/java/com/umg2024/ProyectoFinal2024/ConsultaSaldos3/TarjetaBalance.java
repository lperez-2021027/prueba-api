package com.umg2024.ProyectoFinal2024.ConsultaSaldos3;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "Tarjeta") // No necesitas especificar el nombre de la base de datos aquí.
public class TarjetaBalance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tarjeta_id;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal saldoAlCorte;

    @Column(nullable = false)
    private Integer usuarioId;

    @Column(nullable = false, unique = true, length = 16)
    private String numeroTarjeta;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaExpiracion;

    @Column(nullable = false, length = 3)
    private String cvv;

    @Column(nullable = false, length = 4)
    private String pin;

    @Column(nullable = false)
    private Integer fechaCorte;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal limiteCredito;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal saldoActual;

    public Integer getTarjeta_id() {
        return tarjeta_id;
    }

    public void setTarjeta_id(Integer tarjeta_id) {
        this.tarjeta_id = tarjeta_id;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public Integer getFechaCorte() {
        return fechaCorte;
    }

    public void setFechaCorte(Integer fechaCorte) {
        this.fechaCorte = fechaCorte;
    }

    public BigDecimal getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(BigDecimal limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public BigDecimal getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(BigDecimal saldoActual) {
        this.saldoActual = saldoActual;
    }

    public BigDecimal getSaldoAlCorte() {
        return saldoAlCorte;
    }

    public void setSaldoAlCorte(BigDecimal saldoAlCorte) {
        this.saldoAlCorte = saldoAlCorte;
    }

    // Getters y setters

}
