package com.marticus.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.marticus.dao.CoachingCentre;
import com.marticus.dao.Student1;
import com.marticus.util.HibernateUtil;

public class CoachingApp {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
		transaction = session.beginTransaction();
		Set<CoachingCentre> ccName = new HashSet<CoachingCentre>();
		ccName.add(new CoachingCentre("PHYSICS","1212"));
		ccName.add(new CoachingCentre("CHEMISTRY","1215"));
		ccName.add(new CoachingCentre("MATHS","1215"));
		
		Student1 s2 = new Student1("FARAAZ", ccName);
		session.save(s2);
		

							
		transaction.commit();
	} catch (HibernateException e) {
		transaction.rollback();
		e.printStackTrace();
	} finally {
		session.close();
	}

}

}
