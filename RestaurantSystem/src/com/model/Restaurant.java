package com.model;

public class Restaurant {
	private int rid;
	private String resName;
	private String openingTime;
	private String closingTime;
	private String phoneNo;
	private String address_of_res;
	private String cuisine;
	
	public Restaurant() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Restaurant(int rid, String resName, String openingTime, String closingTime, String phoneNo,
			String address_of_res, String cuisine) {
		super();
		this.rid = rid;
		this.resName = resName;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
		this.phoneNo = phoneNo;
		this.address_of_res = address_of_res;
		this.cuisine = cuisine;
	}


	public int getRid() {
		return rid;
	}


	public void setRid(int rid) {
		this.rid = rid;
	}


	public String getResName() {
		return resName;
	}

	public void setResName(String resName) {
		this.resName = resName;
	}

	public String getOpeningTime() {
		return openingTime;
	}

	public void setOpeningTime(String openingTime) {
		this.openingTime = openingTime;
	}

	public String getClosingTime() {
		return closingTime;
	}

	public void setClosingTime(String closingTime) {
		this.closingTime = closingTime;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress_of_res() {
		return address_of_res;
	}

	public void setAddress_of_res(String address_of_res) {
		this.address_of_res = address_of_res;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	
	
	
	
	
}
