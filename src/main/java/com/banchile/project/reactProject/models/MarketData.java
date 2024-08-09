package com.banchile.project.reactProject.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MarketData {
    private Long idMarketData;
    private String name;
    private String baseCurrency;
    private String quoteCurrency;
    private List<String> minimumOrderAmount;
    private String takerFee;
    private String makerFee;
    private Long maxOrdersPerMinute;
    private String makerDiscountPercentage;
    private String takerDiscountPercentage;

    @Override
    public String toString() {
        return "MarketData{" +
                "idMarketData=" + idMarketData +
                ", name='" + name + '\'' +
                ", baseCurrency='" + baseCurrency + '\'' +
                ", quoteCurrency='" + quoteCurrency + '\'' +
                ", minimumOrderAmount=" + minimumOrderAmount +
                ", takerFee='" + takerFee + '\'' +
                ", makerFee='" + makerFee + '\'' +
                ", maxOrdersPerMinute=" + maxOrdersPerMinute +
                ", makerDiscountPercentage='" + makerDiscountPercentage + '\'' +
                ", takerDiscountPercentage='" + takerDiscountPercentage + '\'' +
                '}';
    }





}
