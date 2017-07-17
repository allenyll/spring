package com.yll.controller;

import com.yll.entity.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yll on 17-7-17.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/{id}")
    public User view(@PathVariable("id") long id){
        User user = new User();
        user.setId(id);
        user.setName("yll");
        return  user;
    }

}
