package com.banchile.project.reactProject.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "MarketData")
public class MarketDataEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "base_currency")
    private String baseCurrency;

    @Column(name = "quote_currency")
    private String quoteCurrency;

    @Column(name = "minimum_order_amount")
    private List<String> minimumOrderAmount;

    @Column(name = "taker_fee")
    private String takerFee;

    @Column(name = "maker_fee")
    private String makerFee;

    @Column(name = "max_orders_per_minute")
    private Long maxOrdersPerMinute;

    @Column(name = "maker_discount_percentage")
    private String makerDiscountPercentage;

    @Column(name = "taker_discount_percentage")
    private String takerDiscountPercentage;

}
