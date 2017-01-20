package com.devcortes.components.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "passport", catalog = "system")
public class Passport implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;	
	
	private String code;
	
	
	/*@OneToOne(optional = false, mappedBy="pass")
	@JsonBackReference*/
	//private Person pers;

	public Passport() {}

	public Passport(String code) {
		this.code = code;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	/*public Person getPerson() {
		return pers;
	}

	public void setPerson(Person person) {
		this.pers = person;
	}*/
	
	
	
}
