package com.javatpoint.mypackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Account1StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		Session session=factory.openSession();
		
		Transaction t=session.beginTransaction();
		
		SavingsAccount1 sa1=new SavingsAccount1();
		sa1.setAccountid(101);
		sa1.setAccountname("acc_name_1");
		sa1.setInterest(18.26);
		
		CurrentAccount1 ca1=new CurrentAccount1();
		ca1.setAccountid(102);
		ca1.setAccountname("acc_name_2");
		ca1.setOverDraftAmount(1256.44);
		
		session.persist(sa1);
		session.persist(ca1);
		
		t.commit();
		session.close();
		System.out.println("Success");

	}

}
