package com.umg2024.ProyectoFinal2024.FechaCorte4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fechascorte")
public class FechaCorteController {

    @Autowired
    private FechaCorteService fechaCorteService;

    @GetMapping("/{tarjetaId}")
    public ResponseEntity<?> obtenerFechasCorte(@PathVariable Integer tarjetaId) {
        try {
            FechaCorteDTO fechaCorteDTO = fechaCorteService.obtenerFechasCorte(tarjetaId);
            return ResponseEntity.ok(fechaCorteDTO);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}