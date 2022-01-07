package com.marticus.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.marticus.dao.Books;
import com.marticus.dao.Library;
import com.marticus.util.HibernateUtil;

public class M2MTApp {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Set<Books> books = new HashSet<Books>();
			books.add(new Books("JAVA"));
			books.add(new Books(".NET"));
			
			
			Library lib1 = new Library("Central Library", books);
			Library lib2 = new Library("National Library", books);
			session.save(lib1);
			session.save(lib2);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}
