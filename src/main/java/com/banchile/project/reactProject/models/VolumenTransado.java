package com.banchile.project.reactProject.models;


import java.util.List;

public class VolumenTransado {

    private String idMarket;
    private List<String> askVolume24h;
    private List<String> askVolume7d;
    private String bidVolume24h;
    private List<String> bidVolume7h;

    @Override
    public String toString() {
        return "VolumenTransado{" +
                "askVolume24h=" + askVolume24h +
                ", askVolume7d=" + askVolume7d +
                ", bidVolume24h='" + bidVolume24h + '\'' +
                ", bidVolume7h=" + bidVolume7h +
                ", idMarket='" + idMarket + '\'' +
                '}';
    }
}
