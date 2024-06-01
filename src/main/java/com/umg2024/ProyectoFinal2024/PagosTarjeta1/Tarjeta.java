package com.umg2024.ProyectoFinal2024.PagosTarjeta1;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Tarjeta {

    @Id
    @GeneratedValue
    private Integer idTarjeta;
    @Basic
    private BigDecimal montoPago;
    private LocalDateTime fechaPago;

}
