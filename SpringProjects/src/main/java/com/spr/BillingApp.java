package com.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BillingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("BillingContext.xml");

        Purchase purchase = context.getBean("purchase", Purchase.class);
        purchase.displayPurchase();

	}

}
/**
 * 
 * Purchase ID: 101
Purchase Date: Sun Aug 03 00:00:00 IST 2025
Product ID: 1
Product Name: Soap
Price: 30.5

 */
