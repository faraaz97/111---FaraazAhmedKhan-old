package com.javatpoint.mypackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class AccountStoreTest {

	public static void main(String args[])
	{
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		Session session=factory.openSession();
		
		 Transaction t=session.beginTransaction();  
	      
//		    Employee e1=new Employee();  
//		    e1.setName("Gaurav Chawla");  
//		      
		    CurrentAccount c1=new CurrentAccount();  
		    c1.setoverDraftamount(10000.000);   
		     
		      
		    SavingsAccount s1=new SavingsAccount();  
		    s1.setInterest(12000.000);    
		      
		    //session.persist(e1);  
		    session.persist(c1);  
		    session.persist(s1);  
		      
		    t.commit();  
		    session.close();  
		    System.out.println("success");  
		
	}
	
}
