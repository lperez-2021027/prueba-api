package com.umg2024.ProyectoFinal2024.DetalleTarjeta6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tarjetadetalle")
public class TarjetaDetalleController {

    @Autowired
    private DetalleService detalleService;

    @GetMapping("/{tarjetaId}")
    public ResponseEntity<?> obtenerDetalleTarjeta(@PathVariable Integer tarjetaId) {
        try {
            TarjetaDetalle tarjeta = detalleService.getCardDetalle(tarjetaId);

            TarjetaDetalleDTO tarjetaDetalleDTO = new TarjetaDetalleDTO();
            tarjetaDetalleDTO.setSaldoDisponible(tarjeta.getLimiteCredito().subtract(tarjeta.getSaldoActual()));
            tarjetaDetalleDTO.setFechaPago(tarjeta.getFechaPago());
            tarjetaDetalleDTO.setPorcentajeInteres(tarjeta.getPorcentajeInteres());
            tarjetaDetalleDTO.setSaldoActual(tarjeta.getSaldoActual());
            tarjetaDetalleDTO.setSaldoAlCorte(tarjeta.getSaldoAlCorte());
            tarjetaDetalleDTO.setFechaCorte(tarjeta.getFechaCorte());

            return ResponseEntity.ok(tarjetaDetalleDTO);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}