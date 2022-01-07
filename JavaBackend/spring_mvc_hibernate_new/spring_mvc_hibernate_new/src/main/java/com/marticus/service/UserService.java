package com.marticus.service;

import java.util.List;

import org.springframework.ui.Model;

import com.marticus.dao.UserDao;
import com.marticus.model.User;


public class UserService {
	
	private static final Model model = null;
	private UserDao userDao;
	
	public  String addUser(User user)
	{
		return userDao.addUser(user, model);
	}
	
	public String delete(int id) throws Exception
	{
		return userDao.delete(id, model);
	}

	public String display(User user)
	{
		return userDao.display(model);
	}
	
	public String update(int id) throws Exception
	{
		return userDao.update(id, model);
	}
}
