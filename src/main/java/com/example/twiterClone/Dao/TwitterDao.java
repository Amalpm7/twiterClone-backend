package com.example.twiterClone.Dao;

import com.example.twiterClone.Model.TwitterModel;

import org.springframework.data.repository.CrudRepository;

public interface TwitterDao extends CrudRepository<TwitterModel,Integer> {
}
