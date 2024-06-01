package com.umg2024.ProyectoFinal2024.EstadoCuenta5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class EstadoCuentaService {

    @Autowired
    private TarjetaEstadoRepository tarjetaRepository;

    @Autowired
    private TransaccionEstadoRepository transaccionRepository;

    public EstadoCuentaDTO generarEstadoCuenta(Integer tarjetaId, LocalDate fechaCorte) {
        TarjetaEstado tarjeta = tarjetaRepository.findById(tarjetaId)
                .orElseThrow(() -> new RuntimeException("Tarjeta no encontrada"));

        LocalDate fechaInicio = fechaCorte.minusMonths(1);

        BigDecimal totalPagos = transaccionRepository.sumByTarjetaIdAndTipoAndFechaBetween(
                tarjetaId, "pago", fechaInicio, fechaCorte);

        BigDecimal totalConsumos = transaccionRepository.sumByTarjetaIdAndTipoAndFechaBetween(
                tarjetaId, "consumo", fechaInicio, fechaCorte);

        return new EstadoCuentaDTO(tarjeta.getSaldoActual(), totalPagos, totalConsumos);
    }
}