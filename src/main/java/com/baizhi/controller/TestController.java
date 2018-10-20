package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2018/10/17.
 */
@Controller
public class TestController {
    @Autowired
    private UserService u;

    @RequestMapping("/test")
    public String test() {
        return "springboot";
    }

    @RequestMapping("/selectAll")
    public String selectAll(HttpServletRequest request) {
        List<User> users = u.selectAll();
        request.setAttribute("a", users);
        return "index";
    }

    @RequestMapping("/insert")
    public void insert(User s) {
        u.insert(s);
    }

    @RequestMapping("/delete")
    public void delete(int id) {
        u.delete(id);
    }

    @RequestMapping("/update")
    public void update(User d) {
        u.update(d);
    }
}
