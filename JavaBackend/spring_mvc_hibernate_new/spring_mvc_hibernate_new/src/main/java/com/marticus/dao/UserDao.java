package com.marticus.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.marticus.model.User;


@Controller
public class UserDao {
	
	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	public String addUser(@Validated User user, Model model )
	{
		 Transaction trns = null;
		 Session session = com.marticus.utility.HibernateUtil.getSessionFactory().openSession();
	        try {
	            trns = session.beginTransaction();
	            model.addAttribute("userid", user.getId());
	    		model.addAttribute("userName", user.getUserName());
	    		model.addAttribute("email", user.getEmail());
	    		model.addAttribute("userAge", user.getUserAge());
	    		session.save(user);
		        session.getTransaction().commit();
	        } catch (RuntimeException e) {
	            if (trns != null) {
	                trns.rollback();
	            }
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	    return "home";
	}
	
	@RequestMapping(value = "/userlist", method = RequestMethod.GET)
	public String display(Model model)
	{
		  
		  Session session = com.marticus.utility.HibernateUtil.getSessionFactory().openSession();	
		  session.beginTransaction();
		  try 
		  	{
			  List<User> user = new ArrayList<User>();
			  ArrayList <User> uList = new ArrayList<User>();
			  List User =(List) session.createQuery("From User").list();
			  for (Iterator iterator2 = (User).iterator(); iterator2.hasNext();)
				{
		            User u = (User) iterator2.next(); 
		            uList.add(u);
		            System.out.println("UserId: " + u.getId());
		            System.out.println("User Name: " + u.getUserName()); 
		            System.out.println("User Email: " + u.getEmail());
		            System.out.println("User Age: " + u.getUserAge());
		         }
				model.addAttribute("uList",uList );
				session.getTransaction().commit();	
	        } catch (RuntimeException e) {
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	  return "userList";
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public  String delete(@PathVariable("id") int id, Model model) throws Exception
	{
		 Transaction trns = null;
		 Session session = com.marticus.utility.HibernateUtil.getSessionFactory().openSession();	
	        try {
	            trns = session.beginTransaction();
	            User user=new User();
	    		user.setId(id);
	    		session.load(user, new Integer(id));
	            session.delete(user);
	            session.getTransaction().commit();
	        } catch (RuntimeException e) {
	            if (trns != null) {
	                trns.rollback();
	            }
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
		return "redirect:/userlist";
	}
	
	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String update(@PathVariable("id") int id, Model model) throws Exception
	{
		 Transaction trns = null;
		 Session session = com.marticus.utility.HibernateUtil.getSessionFactory().openSession();	
	        try {
	            trns = session.beginTransaction();
	            User user=new User();
	    		user.setId(id);
	    		session.load(user, new Integer(id));
	    		model.addAttribute("userId", user.getId());
	    		model.addAttribute("userName", user.getUserName());
	    		model.addAttribute("email", user.getEmail());
	    		model.addAttribute("userAge", user.getUserAge());
	            session.getTransaction().commit();
	        } catch (RuntimeException e) {
	            if (trns != null) {
	                trns.rollback();
	            }
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
		return "update";
	}

	
	@RequestMapping(value = "/updateUser", method = RequestMethod.POST)
	public String updateUser(@Validated User user, Model model)
	{
		 Transaction trns = null;
		 Session session = com.marticus.utility.HibernateUtil.getSessionFactory().openSession();	
	        try {
	            trns = session.beginTransaction();
	            model.addAttribute("userId", user.getId());
	    		model.addAttribute("userName", user.getUserName());
	    		model.addAttribute("email", user.getEmail());
	    		model.addAttribute("userAge", user.getUserAge());
	    		session.update(user);
	            session.getTransaction().commit();
	        } catch (RuntimeException e) {
	            if (trns != null) {
	                trns.rollback();
	            }
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	   return "redirect:/userlist";
	}

}
