package com.home.tradeinfoservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.tradeinfoservice.dao.TradeDao;
import com.home.tradeinfoservice.model.Trade;

@Service
public class TradeServiceImpl implements TradeService {

	@Autowired
	private TradeDao tradeDao;

	@Override
	public Trade getTradeById(Integer tradeId) {

		return tradeDao.getTradeById(tradeId);
	}

	@Override
	public Trade createTrade(Trade trade) {
		return tradeDao.createTrade(trade);
	}

	@Override
	public void deleteTradeById(Integer tradeId) {
		tradeDao.deleteTradeById(tradeId);
	}

	@Override
	public Trade updateTrade() {
		return null;
	}

}
