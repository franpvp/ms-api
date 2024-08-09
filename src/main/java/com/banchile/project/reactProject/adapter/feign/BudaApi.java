package com.banchile.project.reactProject.adapter.feign;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(value = "buda", url = "https://www.buda.com/api/v2")
public interface BudaApi {

    @GetMapping(value = "/markets/{marketId}/ticker")
    Optional<JsonNode> getMarketData(@PathVariable("marketId") String marketId);

    @GetMapping(value = "/currencies/{currency}/fees/{transaction_type}")
    Optional<JsonNode> getCostosAbonosRetiros(@PathVariable("currency") String currency, @PathVariable("transaction_type") String transaction_type);

    @GetMapping(value = "/markets/{market_id}/volume")
    Optional<JsonNode> getVolumenMercado(@PathVariable("market_id") String market_id);

}


