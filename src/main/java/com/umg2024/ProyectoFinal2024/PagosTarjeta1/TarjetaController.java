package com.umg2024.ProyectoFinal2024.PagosTarjeta1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TarjetaController {

    @Autowired
    private TarjetaService pagoService;

    @PostMapping("/realizarPago")
    public String realizarPago(@RequestBody PagoRequest pagoRequest) {
        pagoService.realizarPago(pagoRequest.getTarjetaId(), pagoRequest.getMonto(), pagoRequest.getDescripcion());
        return "Pago realizado con éxito";
    }
}

class PagoRequest {
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

/*
 * private final TarjetaService tarjetaService;
 * 
 * 
 * @PostMapping
 * public void createPagoTarjeta(@RequestBody Tarjeta tarjeta)
 * {
 * tarjetaService.createPagoTarjeta(tarjeta);
 * }
 */
