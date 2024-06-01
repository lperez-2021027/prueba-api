package com.umg2024.ProyectoFinal2024.ConsultaSaldos3;

import java.math.BigDecimal;

public class TarjetaBalanceDTO {

    private BigDecimal saldoActual;
    private BigDecimal saldoDisponible;
    private BigDecimal saldoAlCorte;

    // Constructor
    public TarjetaBalanceDTO(BigDecimal saldoActual, BigDecimal saldoDisponible, BigDecimal saldoAlCorte) {
        this.saldoActual = saldoActual;
        this.saldoDisponible = saldoDisponible;
        this.saldoAlCorte = saldoAlCorte;
    }

    // Getters y setters
    public BigDecimal getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(BigDecimal saldoActual) {
        this.saldoActual = saldoActual;
    }

    public BigDecimal getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(BigDecimal saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public BigDecimal getSaldoAlCorte() {
        return saldoAlCorte;
    }

    public void setSaldoAlCorte(BigDecimal saldoAlCorte) {
        this.saldoAlCorte = saldoAlCorte;
    }
}