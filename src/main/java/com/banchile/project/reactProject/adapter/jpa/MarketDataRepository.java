package com.banchile.project.reactProject.adapter.jpa;

import com.banchile.project.reactProject.entities.MarketDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarketDataRepository extends JpaRepository<MarketDataEntity, Long> {
}
