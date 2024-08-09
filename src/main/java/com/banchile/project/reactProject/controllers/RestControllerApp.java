package com.banchile.project.reactProject.controllers;

import com.banchile.project.reactProject.services.IndicadorService;
import com.banchile.project.reactProject.services.BudaService;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/api")
public class RestControllerApp {

    // Se llama la interfaz de BudaService
    @Autowired
    private BudaService budaService;

    // Se llama la interfaz de indicadorService
    @Autowired
    private IndicadorService indicadorService;

    // Creacion de endpoint BUDA API
    @GetMapping("/consultar-mercado/{market_id}")
    public ResponseEntity<?> fetchAndSaveMarketData(@PathVariable("market_id") String market_id) {
        Optional<JsonNode> marketData = budaService.getMarketData(market_id);

        return marketData.map(jsonNode -> new ResponseEntity<>(marketData,HttpStatus.OK))
                .orElseGet(() ->new ResponseEntity<>(HttpStatus.NO_CONTENT));
    }

    @GetMapping("/consultar-costos/{currency}/{transaction_type}")
    public ResponseEntity<?> fetchAndSaveCostos(@PathVariable("currency") String currency, @PathVariable("transaction_type") String transaction_type) {
        Optional<JsonNode> costosAbonosRetiros = budaService.getCostosAbonosRetiros(currency, transaction_type);

        return costosAbonosRetiros.map(jsonNode -> new ResponseEntity<>(costosAbonosRetiros, HttpStatus.OK))
                .orElseGet(() ->new ResponseEntity<>(HttpStatus.NO_CONTENT));
    }

    @GetMapping("/consultar-volumen/{market_id}")
    public ResponseEntity<?> fetchAndSaveVolumenMercado(@PathVariable("market_id") String market_id) {
        Optional<JsonNode> getVolumenMercado = budaService.getVolumenMercado(market_id);

        return getVolumenMercado.map(jsonNode -> new ResponseEntity<>(getVolumenMercado, HttpStatus.OK))
                .orElseGet(() ->new ResponseEntity<>(HttpStatus.NO_CONTENT));
    }


    // ENDPOINTS INDICADORES API
    @GetMapping("/consultar-indicadores")
    public ResponseEntity<?> fetchAndSaveAllIndicadores() {
        Optional<JsonNode> allIndicadores = indicadorService.getAllIndicadores();

        return allIndicadores.map(jsonNode -> new ResponseEntity<>(allIndicadores, HttpStatus.OK))
                .orElseGet(() ->new ResponseEntity<>(HttpStatus.NO_CONTENT));
    }

    @GetMapping("/consultar-tipo/{tipo_indicador}")
    public ResponseEntity<?> fetchAndSaveTipoIndicador(@PathVariable("tipo_indicador") String tipo_indicador) {
        Optional<JsonNode> getTipoIndicador = indicadorService.getTipoIndicador(tipo_indicador);

        return getTipoIndicador.map(jsonNode -> new ResponseEntity<>(getTipoIndicador, HttpStatus.OK))
                .orElseGet(() ->new ResponseEntity<>(HttpStatus.NO_CONTENT));
    }

    @GetMapping("/consultar-tipo-fecha/{tipo_indicador}/{fecha}")
    public ResponseEntity<?> fetchAndSaveFechaTipoIndicador(@PathVariable("tipo_indicador") String tipo_indicador, @PathVariable("fecha") @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate fecha) {
        Optional<JsonNode> getFechaTipoIndicador = indicadorService.getTipoIndicadorFecha(tipo_indicador, fecha);

        return getFechaTipoIndicador.map(jsonNode -> new ResponseEntity<>(getFechaTipoIndicador, HttpStatus.OK))
                .orElseGet(() ->new ResponseEntity<>(HttpStatus.NO_CONTENT));
    }

    @GetMapping("/consultar-tipo-año/{tipo_indicador}/{anio}")
    public ResponseEntity<?> fetchAndSaveAnioTipoIndicador(@PathVariable("tipo_indicador") String tipo_indicador, @PathVariable("anio") String anio) {
        Optional<JsonNode> getAnioTipoIndicador = indicadorService.getTipoIndicadorAnio(tipo_indicador, anio);

        return getAnioTipoIndicador.map(jsonNode -> new ResponseEntity<>(getAnioTipoIndicador, HttpStatus.OK))
                .orElseGet(() ->new ResponseEntity<>(HttpStatus.NO_CONTENT));
    }


}
