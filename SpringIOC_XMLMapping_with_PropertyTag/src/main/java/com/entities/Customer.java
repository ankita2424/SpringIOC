package com.entities;

public class Customer {
	private int cust_id;
	private String cname;
	private String address;
	private City city;

	public Customer() {

	}

	public Customer(int cust_id, String cname, String address, City city) {
		super();
		this.cust_id = cust_id;
		this.cname = cname;
		this.address = address;
		this.city = city;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", cname=" + cname + ", address=" + address + ", city=" + city + "]";
	}

	

}
