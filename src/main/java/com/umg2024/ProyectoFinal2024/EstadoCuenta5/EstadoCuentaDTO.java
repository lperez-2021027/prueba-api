package com.umg2024.ProyectoFinal2024.EstadoCuenta5;

import java.math.BigDecimal;

public class EstadoCuentaDTO {

    private BigDecimal saldoActual;
    private BigDecimal totalPagos;
    private BigDecimal totalConsumos;

    // Constructor
    public EstadoCuentaDTO(BigDecimal saldoActual, BigDecimal totalPagos, BigDecimal totalConsumos) {
        this.saldoActual = saldoActual;
        this.totalPagos = totalPagos;
        this.totalConsumos = totalConsumos;
    }

    // Getters y setters
    public BigDecimal getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(BigDecimal saldoActual) {
        this.saldoActual = saldoActual;
    }

    public BigDecimal getTotalPagos() {
        return totalPagos;
    }

    public void setTotalPagos(BigDecimal totalPagos) {
        this.totalPagos = totalPagos;
    }

    public BigDecimal getTotalConsumos() {
        return totalConsumos;
    }

    public void setTotalConsumos(BigDecimal totalConsumos) {
        this.totalConsumos = totalConsumos;
    }
}