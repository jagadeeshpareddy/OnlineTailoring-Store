package com.Tailoring.store.management.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tailor {
	
	private String shopName;
	private String Address;
	private String contactNumber;
	private String workingHours;
	private String availableServices;
	private String courier;
	private String userId;

	

	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getShopName() {
		return shopName;
	}


	public void setShopName(String shopName) {
		this.shopName = shopName;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public String getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}


	public String getWorkingHours() {
		return workingHours;
	}


	public void setWorkingHours(String workingHours) {
		this.workingHours = workingHours;
	}


	public String getAvailableServices() {
		return availableServices;
	}


	public void setAvailableServices(String availableServices) {
		this.availableServices = availableServices;
	}


	public String getCourier() {
		return courier;
	}


	public void setCourier(String courier) {
		this.courier = courier;
	}


	@Override
	public String toString() {
		return "Tailor [shopName=" + shopName + ", Address=" + Address + ", contactNumber=" + contactNumber
				+ ", workingHours=" + workingHours + ", availableServices=" + availableServices + ", courier=" + courier
				+ "]";
	}


	
	
	
}
