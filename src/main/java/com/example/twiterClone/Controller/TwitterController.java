package com.example.twiterClone.Controller;


import com.example.twiterClone.Dao.TwitterDao;
import com.example.twiterClone.Model.TwitterModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwitterController {


    @Autowired
    private TwitterDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addUser",consumes = "application/json",produces = "application/json")
    private String addUser(@RequestBody TwitterModel user){
        System.out.println(user.toString());
        dao.save(user);
        return "(status:'success')";
    }

}
