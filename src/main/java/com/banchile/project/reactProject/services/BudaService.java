package com.banchile.project.reactProject.services;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.Optional;

public interface BudaService {
    Optional<JsonNode> getMarketData(String marketId);
    Optional<JsonNode> getCostosAbonosRetiros(String currency, String transaction_type);
    Optional<JsonNode> getVolumenMercado(String market_id);
}
