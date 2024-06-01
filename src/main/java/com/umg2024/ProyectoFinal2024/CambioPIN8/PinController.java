package com.umg2024.ProyectoFinal2024.CambioPIN8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pin")
public class PinController {

    @Autowired
    private PinService pinService;

    @PutMapping("/{tarjetaId}")
    public ResponseEntity<?> cambiarPin(@PathVariable Integer tarjetaId, @RequestBody CambioPinDTO cambioPinDTO) {
        try {
            pinService.cambiarPin(tarjetaId, cambioPinDTO.getPin());
            return ResponseEntity.ok("PIN cambiado con éxito");
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}