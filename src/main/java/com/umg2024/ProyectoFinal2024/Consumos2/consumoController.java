package com.umg2024.ProyectoFinal2024.Consumos2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class consumoController {

    @Autowired
    private ConsumoService consumoService;

    @PostMapping("/registrarConsumo")
    public ResponseEntity<String> realizarPago(@RequestBody ConsumoRequest consumoRequest) {
        try {
            consumoService.registrarConsumo(consumoRequest.getTarjetaId(), consumoRequest.getMonto(),
                    consumoRequest.getDescripcion());
            return ResponseEntity.ok("Consumo registrado con éxito");
        } catch (DataIntegrityViolationException e) {
            String errorMessage = e.getCause().getMessage();
            if (errorMessage.contains("El consumo sobrepasa el límite de crédito disponible")) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
            } else {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al registrar el consumo");
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al registrar el consumo");
        }
    }
}

class ConsumoRequest {
    private int tarjetaId;
    private double monto;
    private String descripcion;

    // Getters y setters
    public int getTarjetaId() {
        return tarjetaId;
    }

    public void setTarjetaId(int tarjetaId) {
        this.tarjetaId = tarjetaId;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}