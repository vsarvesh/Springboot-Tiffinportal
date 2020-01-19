package com.sarvesh.portal.tiffinportal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="provider_details")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;


	@Column(name="ra_number")
	private String raNumber;
	
	@Column(name="provider_no")
	private String providerNo;
	
	@Column(name="hpio")
	private String hpio;
	
	@Column(name="is_default")
	private String isDefault;
	
	
	public Customer() {
		
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getRaNumber() {
		return raNumber;
	}


	public void setRaNumber(String raNumber) {
		this.raNumber = raNumber;
	}


	public String getProviderNo() {
		return providerNo;
	}


	public void setProviderNo(String providerNo) {
		this.providerNo = providerNo;
	}


	public String getHpio() {
		return hpio;
	}


	public void setHpio(String hpio) {
		this.hpio = hpio;
	}


	public String getIsDefault() {
		return isDefault;
	}


	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}


	@Override
	public String toString() {
		return "Customer [raNumber=" + raNumber + ", providerNo=" + providerNo + ", hpio=" + hpio + ", isDefault="
				+ isDefault + "]";
	}
	
	

}
