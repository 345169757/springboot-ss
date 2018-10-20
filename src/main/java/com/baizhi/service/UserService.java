package com.baizhi.service;

import com.baizhi.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2018/10/17.
 */
public interface UserService {
    public List<User> selectAll();
    public void insert(User u);
    public void delete(int id);
    public void update(User u);
}
