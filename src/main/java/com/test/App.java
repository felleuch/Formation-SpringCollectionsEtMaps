package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");

		//Customer cust = (Customer) context.getBean("CustomerBean");
		//System.out.println(cust);
		
		
		
		Client client = (Client) context.getBean("clientBean");
		
		System.out.println("Eligibility du client :"+client.getElegibility());
		
		System.out.println("Liste des commandes du client :"+client.getName());
		
		for(String elem:client.getOrders()) {
			System.out.println(elem);
		}
System.out.println("Liste des factures du client :"+client.getName());
		
		for(String elem:client.getInvoces()) {
			System.out.println(elem);
		}
		
		
	}
}