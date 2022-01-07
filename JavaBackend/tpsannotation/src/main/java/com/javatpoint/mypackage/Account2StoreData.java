package com.javatpoint.mypackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Account2StoreData {
	public static void main(String args[]) {
		
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		Session session=factory.openSession();
		
		 Transaction t=session.beginTransaction();
		 
		 SavingsAccount2 s1=new SavingsAccount2();
//		 s1.setId(01);
		 s1.setAccount_id("savings_201");
		 s1.setAccountname("saveaccount1");
		 s1.setInterest(19.25);
		 
		 CurrentAccount2 c1=new CurrentAccount2();
//		 c1.setId(02);
		 c1.setAccount_id("current_202");
		 c1.setAccountname("currentaccount1");
         c1.setOverDraftAccount(25000.00);	
         
         session.persist(s1);
         session.persist(c1);
         
         t.commit();  
		 session.close();  
		 System.out.println("success");  
	}

}
