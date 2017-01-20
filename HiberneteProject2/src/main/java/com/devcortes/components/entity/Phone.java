package com.devcortes.components.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "phone", catalog = "system")
public class Phone implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "idPhone")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPhone;	
	
	private String producer;
	
	private String model;
	
	private String number;	
	
	private Integer owner;
	
	@OneToOne
    @JoinColumn(name = "idFeatures")
    private PhoneFeatures phoneFeatures; 
	
	//private Integer idFeatures;
	
	/*@ManyToOne
    @JoinColumn(name = "owner")
	@JsonBackReference
	private Person pers;*/
	

	public Phone() {}

	public Phone(Integer idPhone, String producer, String model, String number, Integer owner/*, Integer idFeatures*/) {
		this.idPhone = idPhone;
		this.producer = producer;
		this.model = model;
		this.number = number;
		this.owner = owner;
		//this.idFeatures = idFeatures;
	}

	public Integer getIdPhone() {
		return idPhone;
	}

	public void setIdPhone(Integer idPhone) {
		this.idPhone = idPhone;
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

	public Integer getOwner() {
		return owner;
	}

	public void setOwner(Integer owner) {
		this.owner = owner;
	}

	public PhoneFeatures getPhoneFeatures() {
		return phoneFeatures;
	}

	public void setPhoneFeatures(PhoneFeatures phoneFeatures) {
		this.phoneFeatures = phoneFeatures;
	}

	
	
	/*public List<PhoneFeatures> getList() {
		return list;
	}

	public void setList(List<PhoneFeatures> list) {
		this.list = list;
	}*/
	
	
	/*public Integer getFeature() {
		return idFeatures;
	}

	public void setFeature(Integer idFeatures) {
		this.idFeatures = idFeatures;
	}
	*/
	

	/*public Person getPers() {
		return pers;
	}

	public void setPers(Person pers) {
		this.pers = pers;
	}*/
	
	
	
	
}
