package com.umg2024.ProyectoFinal2024.DetalleTarjeta6;

import java.math.BigDecimal;
import java.util.Date;

public class TarjetaDetalleDTO {
    private BigDecimal saldoDisponible;
    private Date fechaPago;
    private BigDecimal porcentajeInteres;
    private BigDecimal saldoActual;
    private BigDecimal saldoAlCorte;
    private Integer fechaCorte;

    public BigDecimal getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(BigDecimal saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public BigDecimal getPorcentajeInteres() {
        return porcentajeInteres;
    }

    public void setPorcentajeInteres(BigDecimal porcentajeInteres) {
        this.porcentajeInteres = porcentajeInteres;
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

    public Integer getFechaCorte() {
        return fechaCorte;
    }

    public void setFechaCorte(Integer fechaCorte) {
        this.fechaCorte = fechaCorte;
    }

}