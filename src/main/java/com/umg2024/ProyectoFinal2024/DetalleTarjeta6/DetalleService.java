package com.umg2024.ProyectoFinal2024.DetalleTarjeta6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleService {

    @Autowired
    private TarjetaDetalleRepository tarjetaDetalleRepository;

    public TarjetaDetalle getCardDetalle(Integer tarjetaId) {
        return tarjetaDetalleRepository.findById(tarjetaId)
                .orElseThrow(() -> new RuntimeException("Tarjeta no encontrada"));
    }
}
