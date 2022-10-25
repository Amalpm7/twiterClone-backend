package com.example.twiterClone.Dao;

import com.example.twiterClone.Model.TwitterModel;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TwitterDao extends CrudRepository<TwitterModel,Integer> {

    @Query(value = "SELECT `id`, `dob`, `email_id`, `name`, `password`, `phone`, `place` FROM `users` WHERE `email_id`= :email AND`password`= :password",nativeQuery = true)
    List<TwitterModel> signup(String email, String password);
}
