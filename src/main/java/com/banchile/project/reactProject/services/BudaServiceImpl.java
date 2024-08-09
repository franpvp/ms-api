package com.banchile.project.reactProject.services;


import com.banchile.project.reactProject.adapter.feign.BudaApi;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BudaServiceImpl implements BudaService {

    // Se llama la interfaz del feign
    @Autowired
    public BudaApi budaApi;

    @Override
    public Optional<JsonNode> getMarketData(String marketId) {
        return budaApi.getMarketData(marketId);
    }

    @Override
    public Optional<JsonNode> getCostosAbonosRetiros(String currency, String transaction_type) {
        return budaApi.getCostosAbonosRetiros(currency, transaction_type);
    }

    @Override
    public Optional<JsonNode> getVolumenMercado(String market_id) {
        return budaApi.getVolumenMercado(market_id);
    }
}
