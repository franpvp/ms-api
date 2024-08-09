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
@Table(name = "VolumenTransado")
public class VolumenTransadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ask_volume_24h")
    private List<String> askVolume24h;

    @Column(name = "ask_volume_7d")
    private List<String> askVolume7d;

    @Column(name = "bid_volume_24h")
    private List<String> bidVolume24h;

    @Column(name = "bid_volume_7h")
    private List<String> bidVolume7h;

    @Column(name = "market_id")
    private String marketId;



}
