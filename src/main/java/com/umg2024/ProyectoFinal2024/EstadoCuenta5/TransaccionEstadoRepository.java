package com.umg2024.ProyectoFinal2024.EstadoCuenta5;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface TransaccionEstadoRepository extends JpaRepository<TransaccionEstado, Integer> {

    @Query("SELECT SUM(t.monto) FROM TransaccionEstado t WHERE t.tarjetaId = :tarjetaId AND t.tipo = :tipo AND t.fecha BETWEEN :fechaInicio AND :fechaFin")
    BigDecimal sumByTarjetaIdAndTipoAndFechaBetween(
            @Param("tarjetaId") Integer tarjetaId,
            @Param("tipo") String tipo,
            @Param("fechaInicio") LocalDate fechaInicio,
            @Param("fechaFin") LocalDate fechaFin);
}