package com.banchile.project.reactProject.services;

import com.fasterxml.jackson.databind.JsonNode;

import java.time.LocalDate;
import java.util.Optional;

public interface IndicadorService {

    //Firmas de métodos
    Optional<JsonNode> getAllIndicadores();
    Optional<JsonNode> getTipoIndicador(String tipo_indicador);
    Optional<JsonNode> getTipoIndicadorFecha(String tipo_indicador, LocalDate fecha);
    Optional<JsonNode> getTipoIndicadorAnio(String tipo_indicador, String anio);
}
