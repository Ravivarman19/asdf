package com.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class productDetails {
	
	private List<mobiles> mobiles;

	
	public List<mobiles> getMobiles() {
		return mobiles;
	}

	public void setMobiles(List<mobiles> mobiles) {
		this.mobiles = mobiles;
	} 

	
	
	
	
}
