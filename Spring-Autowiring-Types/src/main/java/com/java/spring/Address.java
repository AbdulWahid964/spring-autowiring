package com.java.spring;

public class Address {

	private String addressName;

	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}
//??Fdgsdf VARUNN
	@Override
	public String toString() {
		return "Address [addressName=" + addressName + "]";
	}
	public Address(String addressName) {
		super();
		this.addressName = addressName;
	}

	public Address() {
		super();
	}
	
}
