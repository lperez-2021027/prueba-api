package com.umg2024.ProyectoFinal2024.EstadoCuenta5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/estadocuenta")
public class EstadoCuentaController {

    @Autowired
    private EstadoCuentaService estadoCuentaService;

    @GetMapping("/{tarjetaId}")
    public ResponseEntity<?> generarEstadoCuenta(
            @PathVariable Integer tarjetaId,
            @RequestParam(value = "fechaCorte", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fechaCorte) {
        try {
            if (fechaCorte == null) {
                fechaCorte = LocalDate.now(); // Usar la fecha actual si no se proporciona fechaCorte
            }
            EstadoCuentaDTO estadoCuentaDTO = estadoCuentaService.generarEstadoCuenta(tarjetaId, fechaCorte);
            return ResponseEntity.ok(estadoCuentaDTO);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}