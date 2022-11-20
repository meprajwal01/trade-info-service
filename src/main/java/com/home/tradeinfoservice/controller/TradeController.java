package com.home.tradeinfoservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.home.tradeinfoservice.model.Trade;
import com.home.tradeinfoservice.service.TradeService;

@RestController
public class TradeController {

	@Autowired
	private TradeService tradeService;

	@GetMapping(value = "trade/{id}")
	public ResponseEntity<Trade> getTradeById(@PathVariable("id") Integer myId) {

		return new ResponseEntity<Trade>(tradeService.getTradeById(myId), HttpStatus.OK);
	}

	@PostMapping(value = "trade")
	public ResponseEntity<Trade> createTrade(@RequestBody Trade trade) {
		
		return new ResponseEntity<Trade>(tradeService.createTrade(trade), HttpStatus.CREATED);
	}

	@DeleteMapping(value = "trade/{id}")
	public ResponseEntity<Object> deleteTradeById(@PathVariable("id") Integer myId) {
		
		tradeService.deleteTradeById(myId);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}

}
