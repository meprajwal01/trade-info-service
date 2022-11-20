package com.home.tradeinfoservice.dao;

import com.home.tradeinfoservice.model.Trade;

public interface TradeDao {
	
	Trade getTradeById(Integer tradeId);

	Trade createTrade(Trade trade);

	void deleteTradeById(Integer tradeId);

	Trade updateTrade();

}
