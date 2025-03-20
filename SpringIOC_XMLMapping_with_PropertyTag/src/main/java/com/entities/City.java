package com.entities;

public class City {
	private int cid;
	private String name;

	public City() {

	}

	public City(int cid, String name) {
		super();
		this.cid = cid;
		this.name = name;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "City [cid=" + cid + ", name=" + name + "]";
	}

}
