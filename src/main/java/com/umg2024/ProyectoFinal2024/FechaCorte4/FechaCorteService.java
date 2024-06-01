package com.umg2024.ProyectoFinal2024.FechaCorte4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class FechaCorteService {

    @Autowired
    private TarjetaCorteRepository tarjetaCorteRepository;

    public FechaCorteDTO obtenerFechasCorte(Integer tarjetaId) {
        // Usa la instancia inyectada tarjetaCorteRepository en lugar de la clase
        // TarjetaCorteRepository
        TarjetaCorte tarjeta = tarjetaCorteRepository.findById(tarjetaId)
                .orElseThrow(() -> new RuntimeException("Tarjeta no encontrada"));

        LocalDate fechaCorteActual = LocalDate.now().withDayOfMonth(tarjeta.getFechaCorte());
        LocalDate fechaCorteProxima = fechaCorteActual.plusMonths(1);
        LocalDate fechaCortePasada = fechaCorteActual.minusMonths(1);

        return new FechaCorteDTO(fechaCorteProxima, fechaCortePasada);
    }
}
