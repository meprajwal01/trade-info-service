package com.home.tradeinfoservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.home.tradeinfoservice.model.Trade;

public interface TradeRepo extends JpaRepository<Trade, Integer> {

}
