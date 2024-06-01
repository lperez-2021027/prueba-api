package com.umg2024.ProyectoFinal2024.CambioPIN8;

import com.umg2024.ProyectoFinal2024.DetalleTarjeta6.TarjetaDetalle;
import com.umg2024.ProyectoFinal2024.DetalleTarjeta6.TarjetaDetalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PinService {

    @Autowired
    private TarjetaDetalleRepository tarjetaDetalleRepository;

    public void cambiarPin(Integer tarjetaId, String nuevoPin) {
        TarjetaDetalle tarjeta = tarjetaDetalleRepository.findById(tarjetaId)
                .orElseThrow(() -> new RuntimeException("Tarjeta no encontrada"));

        tarjeta.setPin(nuevoPin);
        tarjetaDetalleRepository.save(tarjeta);
    }
}