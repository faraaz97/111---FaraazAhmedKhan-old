package com.marticus.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.marticus.dao.Aadhar;
import com.marticus.dao.Person;
import com.marticus.util.HibernateUtil;

public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Person p1 = new Person("Faraaz","12345678");
			Person p2 = new Person("Ahmed", "2457866");
			Aadhar a1=new Aadhar(1,p1);
			Aadhar a2=new Aadhar(2,p2);
			session.save(a1);
			session.save(a2);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}
