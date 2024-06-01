package com.umg2024.ProyectoFinal2024.ConsultaSaldos3;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TarjetaBalanceRepository extends JpaRepository<TarjetaBalance, Integer> {
    // Métodos de consulta adicionales pueden ser añadidos aquí si es necesario
}
