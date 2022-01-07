//package com.marticus.controller;
//
//import java.text.DateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Locale;
//
//import org.hibernate.Session;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.marticus.model.User;
//
//
//
//
//@Controller
//public class HomeController {
//
//	/**
//	 * Simply selects the home view to render by returning its name.
//	 */
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String home(Locale locale, Model model) {
//		System.out.println("Home Page Requested, locale = " + locale);
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//
//		String formattedDate = dateFormat.format(date);
//
//		model.addAttribute("serverTime", formattedDate);
//
//		return "redirect:/userlist";
//	}
//	
//	@RequestMapping(value = "/addData", method = RequestMethod.GET)
//	public String addData(User user, Model model) {
//		System.out.println("User Page Requested");
//		
//		return "home";
//	}
//
//	@RequestMapping(value = "/user", method = RequestMethod.POST)
//	public String user(@Validated User user, Model model) {
//		System.out.println("User Page Requested");
//		
//		model.addAttribute("userid", user.getId());
//		model.addAttribute("userName", user.getUserName());
//		model.addAttribute("email", user.getEmail());
//		model.addAttribute("userAge", user.getUserAge());
//		
//		Session session = com.marticus.utility.HibernateUtil.getSessionFactory().openSession();
//		session.beginTransaction();
//		
//		session.save(user);
//		
//		session.getTransaction().commit();
//		session.close();
//	
//		return "user";
//	}
//	
//	@RequestMapping(value = "/search", method = RequestMethod.GET)
//	public String search(@Validated User user, Model model) {
//		System.out.println("User Page Requested");
//		
//		return "search";
//	}
//	
//	@RequestMapping(value = "/gotSearch", method = RequestMethod.POST)
//	public String getUser(String id, Model model) {
//		System.out.println("User Page Requested");
//		
//		Session session = com.marticus.utility.HibernateUtil.getSessionFactory().openSession();
//		session.beginTransaction();
//		User u1=new User();
//		u1.setId(Integer.parseInt(id));
//		session.load(u1, new Integer(id));
//		model.addAttribute("userName", u1.getUserName());
//		model.addAttribute("userid", u1.getId());
//		model.addAttribute("email", u1.getEmail());
//		model.addAttribute("userAge", u1.getUserAge());
//	
//		session.getTransaction().commit();
//		session.close();
//	
//		return "gotSearch";
//	}
//	
//	@RequestMapping(value = "/userlist", method = RequestMethod.GET)
//	public String userlist(Model model) {
//		 //HQL - Hibenate Query Language
//		Session session = com.marticus.utility.HibernateUtil.getSessionFactory().openSession();
//		session.beginTransaction();
//		//select * from Users -- equivalent SQL
//		List User =(List) session.createQuery("From User").list();
//		ArrayList <User> uList = new ArrayList<User>();
//		for (Iterator iterator2 = (User).iterator(); iterator2.hasNext();)
//		{
//            User u = (User) iterator2.next(); 
//            
//            uList.add(u);
//            System.out.println("UserId: " + u.getId());
//            System.out.println("User Name: " + u.getUserName()); 
//            System.out.println("User Email: " + u.getEmail());
//            System.out.println("User Age: " + u.getUserAge());
//         }
//		model.addAttribute("uList",uList );
//		session.getTransaction().commit();
//		session.close();
//	
//		return "userList";
//	}
//	
//	@RequestMapping(value = "/delect/{id}", method = RequestMethod.GET)
//	public String dataDelete(@PathVariable("id") int id, Model model) throws Exception 
//	{
//		System.out.println("updateList  Page Requested");
//		
//		Session session = com.marticus.utility.HibernateUtil.getSessionFactory().openSession();
//		session.beginTransaction();
//		User user=new User();
//		user.setId(id);
//		session.load(user, new Integer(id));
//		session.delete(user);
//		session.getTransaction().commit();
//		session.close();
//		return "redirect:/userlist";
//	}
//	
//	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
//	public String update(@PathVariable("id") int id, Model model) throws Exception {
//		System.out.println("User Page Requested");
//		Session session = com.marticus.utility.HibernateUtil.getSessionFactory().openSession();
//		session.beginTransaction();
//		User user=new User();
//		user.setId(id);
//		session.load(user, new Integer(id));
//		model.addAttribute("userId", user.getId());
//		model.addAttribute("userName", user.getUserName());
//		model.addAttribute("email", user.getEmail());
//		model.addAttribute("userAge", user.getUserAge());
//		session.getTransaction().commit();
//		session.close();
//		return "update";
//	}
//	
//	@RequestMapping(value = "/updateuser", method = RequestMethod.POST)
//	public String updateUser(@Validated User user , Model model) {
//		System.out.println("User Page Requested");
//	
//		model.addAttribute("userId", user.getId());
//		model.addAttribute("userName", user.getUserName());
//		model.addAttribute("email", user.getEmail());
//		model.addAttribute("userAge", user.getUserAge());
//		Session session = com.marticus.utility.HibernateUtil.getSessionFactory().openSession();
//		session.beginTransaction();
//		session.update(user);
//		session.getTransaction().commit();
//		session.close();
//	
//		return "redirect:/userlist";
//	}
//	
//}