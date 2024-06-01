package com.umg2024.ProyectoFinal2024.PagosTarjeta1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class TarjetaService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void realizarPago(int tarjetaId, double monto, String descripcion) {
        jdbcTemplate.update(
                "CALL RealizarPagoTarjeta(?, ?, ?)",
                tarjetaId, monto, descripcion);

        /*
         * private final TarjetaRepository tarjetaRepo;
         * 
         * public void createPagoTarjeta(Tarjeta tarjeta){
         * tarjetaRepo.save(tarjeta);
         * 
         * }
         */

    }

}