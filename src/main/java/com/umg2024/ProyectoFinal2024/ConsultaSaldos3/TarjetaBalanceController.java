package com.umg2024.ProyectoFinal2024.ConsultaSaldos3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tarjetas")
public class TarjetaBalanceController {

    @Autowired
    private BalanceService balanceService;

    @GetMapping("/{tarjetaId}")
    public ResponseEntity<?> getBalance(@PathVariable Integer tarjetaId) {
        try {
            TarjetaBalanceDTO tarjetaBalanceDTO = balanceService.getCardBalance(tarjetaId);
            return ResponseEntity.ok(tarjetaBalanceDTO);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}