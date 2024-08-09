package com.banchile.project.reactProject.services;

import com.banchile.project.reactProject.adapter.feign.IndicadorApi;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class IndicadorServiceImpl implements IndicadorService{

    @Autowired
    private IndicadorApi indicadorApi;

    @Override
    public Optional<JsonNode> getAllIndicadores() {
        return indicadorApi.getAllIndicadores();
    }

    @Override
    public Optional<JsonNode> getTipoIndicador(String tipo_indicador) {
        return indicadorApi.getTipoIndicador(tipo_indicador);
    }

    @Override
    public Optional<JsonNode> getTipoIndicadorFecha(String tipo_indicador, LocalDate fecha) {
        return indicadorApi.getTipoIndicadorFecha(tipo_indicador, fecha);
    }

    @Override
    public Optional<JsonNode> getTipoIndicadorAnio(String tipo_indicador, String anio) {
        return indicadorApi.getTipoIndicadorAnio(tipo_indicador, anio);
    }
}
