package com.home.tradeinfoservice.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trade implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Integer tradeId;
	private String buyer;
	private String seller;
	private Integer quantity;
	
	public Trade() {
	}

	public Trade(Integer tradeId, String buyer, String seller, Integer quantity) {
		super();
		this.tradeId = tradeId;
		this.buyer = buyer;
		this.seller = seller;
		this.quantity = quantity;
	}



	public Integer getTradeId() {
		return tradeId;
	}

	public void setTradeId(Integer tradeId) {
		this.tradeId = tradeId;
	}

	public String getBuyer() {
		return buyer;
	}

	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
