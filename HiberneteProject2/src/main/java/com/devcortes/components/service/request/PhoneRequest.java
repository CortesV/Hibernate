package com.devcortes.components.service.request;

public class PhoneRequest {
	private String producer;
	
	private String model;
	
	private String number;
	
	private String owner;

	public PhoneRequest(String producer, String model, String number, String owner) {
		this.producer = producer;
		this.model = model;
		this.number = number;
		this.owner = owner;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
}
