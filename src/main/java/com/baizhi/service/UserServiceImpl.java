package com.baizhi.service;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/17.
 */
@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao us;
    @Override
    public List<User> selectAll() {
        System.out.println("selectAll()");
        return us.selectAll();
    }

    @Override
    public void insert(User u) {
        us.insert(u);
    }

    @Override
    public void delete(int id) {
            us.delete(id);
    }

    @Override
    public void update(User u) {
            us.update(u);
    }
}
