package com.marticus.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;



@Aspect
public class ReservationAspect{
	@Before("execution(* com.marticus.reservation.Reservation.checkIn(..))")
	public void checkId() {
		System.out.println("-----Checking Id-----");
		System.out.println("Checking Id Successfull!");
		
		
    }
	@Before("execution(* com.marticus.reservation.Reservation.checkIn(..))")
	public void checkVaccCert() {
		System.out.println("-----Checking vaccine certificate-----");
		System.out.println("checked vaccine successfull!!");
//		System.out.println("Room status Checked Successfull!!");
	}
	
	@After("execution(* com.marticus.reservation.Reservation.checkIn(..))")
	public void checkRoomStatus() {
		//System.out.println("Checked Out");
//		joinPoint.proceed();
		System.out.println("-----Checking room status-----");
		
		}
	
}
	
	
	
	
	