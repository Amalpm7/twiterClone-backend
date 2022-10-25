package com.example.twiterClone.Controller;


import com.example.twiterClone.Dao.TwitterDao;
import com.example.twiterClone.DaoP.PostDao;
import com.example.twiterClone.Model.TwitterModel;
import com.example.twiterClone.ModelP.PostModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
public class TwitterController {


    @Autowired
    private TwitterDao dao;

    @Autowired
    private PostDao daop;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addUser",consumes = "application/json",produces = "application/json")
    private String addUser(@RequestBody TwitterModel user){
        System.out.println(user.toString());
        dao.save(user);
        return "(status:'success')";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/login",consumes = "application/json",produces = "application/json")
    public List<TwitterModel> Login(@RequestBody TwitterModel user)
    {
        return (List<TwitterModel>) dao.signup(user.getEmail_id(),user.getPassword());
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addpost",consumes = "application/json",produces = "application/json")
    private String addpost(@RequestBody PostModel post){
        DateTimeFormatter dt= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now= LocalDateTime.now();
        String currentDate= String.valueOf(dt.format(now));
        post.setPosted_date(currentDate);
        System.out.println(post.toString());
        daop.save(post);
        return "(status:'success')";
    }
    @CrossOrigin(origins = "*")
    @GetMapping(path = "/viewpost")
    public List<String> viewAll(){
        return (List<String>) daop.viewAllPosts();
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/single",consumes = "application/json",produces = "application/json")
    List<PostModel> viewSingle(@RequestBody PostModel post)
    {
        return (List<PostModel>) daop.viewSingle(post.getUser_id());
    }

}
