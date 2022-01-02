package com.marticus.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marticus.springmvc.entity.UserEntity;



@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>{
	UserEntity findUsersById(int id);
	UserEntity findUsersByUserName(String userName);

	UserEntity findUsersByUserNameAndPassword(String userName, String password);


}
