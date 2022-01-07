package com.marticus.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.marticus.reservation.Reservation;

public class ReserveApp {
	
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Reservation.xml");
		
		Reservation rb = (Reservation) appContext.getBean("reservation");
		rb.checkIn();
		rb.checkOut();
		
	}
	     

}
