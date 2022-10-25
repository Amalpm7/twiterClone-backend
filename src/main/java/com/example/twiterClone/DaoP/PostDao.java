package com.example.twiterClone.DaoP;

import com.example.twiterClone.ModelP.PostModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostDao extends CrudRepository<PostModel,Integer> {
    @Query(value = "SELECT * FROM `posts` WHERE `user_id`= :user_id",nativeQuery = true)
    List<PostModel> viewSingle(Integer user_id);

    @Query(value = "SELECT p.`id`, p.`tweet`, p.`posted_date`, p.`user_id`,u.name FROM `posts` p JOIN users u ON u.id=p.user_id",nativeQuery = true)
    List<String> viewAllPosts();
}
