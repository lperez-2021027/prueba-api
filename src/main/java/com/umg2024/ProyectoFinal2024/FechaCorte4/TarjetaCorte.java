package com.umg2024.ProyectoFinal2024.FechaCorte4;

import jakarta.persistence.*;

@Entity
@Table(name = "Tarjeta")
public class TarjetaCorte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tarjeta_id;

    @Column(nullable = false)
    private Integer fechaCorte;

    // Otros campos y getters/setters

    public Integer getTarjeta_id() {
        return tarjeta_id;
    }

    public void setTarjeta_id(Integer tarjeta_id) {
        this.tarjeta_id = tarjeta_id;
    }

    public Integer getFechaCorte() {
        return fechaCorte;
    }

    public void setFechaCorte(Integer fechaCorte) {
        this.fechaCorte = fechaCorte;
    }
}