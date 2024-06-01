package com.umg2024.ProyectoFinal2024.FechaCorte4;

import java.time.LocalDate;

public class FechaCorteDTO {

    private LocalDate fechaCorteProxima;
    private LocalDate fechaCortePasada;

    // Constructor
    public FechaCorteDTO(LocalDate fechaCorteProxima, LocalDate fechaCortePasada) {
        this.fechaCorteProxima = fechaCorteProxima;
        this.fechaCortePasada = fechaCortePasada;
    }

    // Getters y setters
    public LocalDate getFechaCorteProxima() {
        return fechaCorteProxima;
    }

    public void setFechaCorteProxima(LocalDate fechaCorteProxima) {
        this.fechaCorteProxima = fechaCorteProxima;
    }

    public LocalDate getFechaCortePasada() {
        return fechaCortePasada;
    }

    public void setFechaCortePasada(LocalDate fechaCortePasada) {
        this.fechaCortePasada = fechaCortePasada;
    }
}