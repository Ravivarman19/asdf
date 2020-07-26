package com.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class mobiles {
	
	private String productName ;
	private int qty;
	private String price;
	private String orderID;
	private deliveryAddress deliveryAddress;
	private contactDetails contactDetails;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public deliveryAddress getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(deliveryAddress deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public contactDetails getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(contactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}
	
	
	
}
