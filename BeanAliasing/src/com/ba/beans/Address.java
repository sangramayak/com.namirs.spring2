package com.ba.beans;

public class Address {

	
	private String addressLine1;
	private String addressLine2;
	private String state;
	private int zip;
	private String country;
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public String getState() {
		return state;
	}
	public int getZip() {
		return zip;
	}
	public String getCountry() {
		return country;
	}
	@Override
	public String toString() {
		return "Address [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", state=" + state
				+ ", zip=" + zip + ", country=" + country + "]";
	}
	
	
}
