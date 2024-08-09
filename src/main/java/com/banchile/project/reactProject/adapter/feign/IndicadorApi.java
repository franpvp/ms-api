package com.banchile.project.reactProject.adapter.feign;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDate;
import java.util.Optional;

@FeignClient(value = "indicador", url = "https://mindicador.cl/api")
public interface IndicadorApi {

    @GetMapping("/")
    Optional<JsonNode> getAllIndicadores();

    @GetMapping("/{tipo_indicador}")
    Optional<JsonNode> getTipoIndicador(@PathVariable("tipo_indicador") String tipo_indicador);

    @GetMapping("/{tipo_indicador}/{fecha}")
    Optional<JsonNode> getTipoIndicadorFecha(@PathVariable("tipo_indicador") String tipo_indicador, @PathVariable("fecha") @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate fecha);

    @GetMapping("/{tipo_indicador}/{anio}")
    Optional<JsonNode> getTipoIndicadorAnio(@PathVariable("tipo_indicador") String tipo_indicador, @PathVariable("anio") String anio);

}


