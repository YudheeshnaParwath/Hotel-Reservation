package com.yudhi.hotelreservation.model.response;

import java.math.BigDecimal;

import com.yudhi.hotelreservation.model.Links;

public class ReservationResponse {

	private Long id;
	private Integer roomNumber;
	private BigDecimal price;
	private Links links;
	
	
	
	public ReservationResponse() {
		super();
	}

	public ReservationResponse(Long id, Integer roomNumber) {
		super();
		this.id = id;
		this.roomNumber = roomNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Links getLinks() {
		return links;
	}

	public void setLinks(Links links) {
		this.links = links;
	}
	
	

	
}
