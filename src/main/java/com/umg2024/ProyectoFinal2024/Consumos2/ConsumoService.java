package com.umg2024.ProyectoFinal2024.Consumos2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class ConsumoService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void registrarConsumo(int tarjetaId, double monto, String descripcion) {
        jdbcTemplate.update(
                "CALL RegistrarConsumo(?, ?, ?)",
                tarjetaId, monto, descripcion);

    }

}
