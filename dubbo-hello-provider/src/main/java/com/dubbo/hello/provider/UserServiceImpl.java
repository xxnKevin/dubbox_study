package com.dubbo.hello.provider;

import com.dubbo.hello.api.User;
import com.dubbo.hello.api.UserService;

public class UserServiceImpl implements UserService {
 
    public User getUser(Long id) {
        return new User(id, "username" + id);
    }
}