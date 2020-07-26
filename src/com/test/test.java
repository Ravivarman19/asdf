package com.test;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.pojo.mobiles;
import com.pojo.productDetails;

public class test {
	public static void main(String[] args) throws JAXBException {
		readvalue();
	}
	public static void readvalue() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(productDetails.class);
		Unmarshaller un = context.createUnmarshaller();
		File xml = new File ("C:\\Users\\Ravi Varman\\Desktop\\New folder\\desktop\\Program\\selenium\\API\\src\\productDetails.xml");
		
		Object obj = un.unmarshal(xml);
		productDetails r = (productDetails) obj;
		
		List<mobiles> mob =  r.getMobiles();
		
		for (mobiles x : mob) {
			System.out.println(x.getProductName());
			System.out.println(x.getQty());
			System.out.println(x.getOrderID());
			System.out.println(x.getPrice());
			System.out.println(x.getContactDetails().getEmailID());
			System.out.println(x.getContactDetails().getPhone());
			System.out.println(x.getDeliveryAddress().getStreetName());
			System.out.println(x.getDeliveryAddress().getCity());
			System.out.println(x.getDeliveryAddress().getDistrict());
			System.out.println(x.getDeliveryAddress().getState());
			System.out.println(x.getDeliveryAddress().getCountry());
			
		}
		
		/*System.out.println("productname: "+r.getProductName());
		System.out.println("productqty: "+r.getQty());
		System.out.println("price: "+r.getPrice());
		System.out.println("orderid: "+r.getOrderID());
		
		System.out.println("Delivery Address");
		System.out.println("StreetName: "+r.getDeliveryAddress().getStreetName());
		System.out.println("City: "+r.getDeliveryAddress().getCity());
		System.out.println("District: "+r.getDeliveryAddress().getDistrict());
		System.out.println("State: "+r.getDeliveryAddress().getState());
		System.out.println("country: "+r.getDeliveryAddress().getCountry());
		
		System.out.println("Contact Details");
		System.out.println("email address: "+r.getContactDetails().getEmailID());
		System.out.println("Phone Number: "+r.getContactDetails().getPhone());
	*/

}
}
