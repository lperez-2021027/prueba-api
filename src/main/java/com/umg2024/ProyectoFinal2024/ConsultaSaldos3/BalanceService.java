package com.umg2024.ProyectoFinal2024.ConsultaSaldos3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BalanceService {

    @Autowired
    private TarjetaBalanceRepository tarjetaBalanceRepository;

    public TarjetaBalanceDTO getCardBalance(Integer tarjetaId) {
        TarjetaBalance tarjeta = tarjetaBalanceRepository.findById(tarjetaId)
                .orElseThrow(() -> new RuntimeException("Tarjeta no encontrada"));

        return new TarjetaBalanceDTO(tarjeta.getSaldoActual(), tarjeta.getLimiteCredito(), tarjeta.getSaldoAlCorte());
    }
}