package com.home.tradeinfoservice.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.home.tradeinfoservice.exception.TradeNotFoundException;
import com.home.tradeinfoservice.model.Trade;
import com.home.tradeinfoservice.repo.TradeRepo;

@Repository
public class TradeDaoImpl implements TradeDao {

	@Autowired
	private TradeRepo tradeRepo;

	@Override
	public Trade getTradeById(Integer tradeId) {

		Optional<Trade> oTrade = tradeRepo.findById(tradeId);
		return oTrade.orElseThrow(() -> new TradeNotFoundException("Trade Not Found"));
	}

	@Override
	public Trade createTrade(Trade trade) {

		return tradeRepo.save(trade);
	}

	@Override
	public void deleteTradeById(Integer tradeId) {

		Optional<Trade> oTrade = tradeRepo.findById(tradeId);
		if (oTrade.isPresent())
			tradeRepo.deleteById(tradeId);
		else {
			throw new TradeNotFoundException("Trade Not Found");
		}
	}

	@Override
	public Trade updateTrade() {
		// TODO Auto-generated method stub
		return null;
	}

}
