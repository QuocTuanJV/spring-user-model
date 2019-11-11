package com.codegym.dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        User u1 = new User();
        u1.setAge(20);
        u1.setName("John");
        u1.setEmail("john@codegym.vn");
        u1.setAccount("john");
        u1.setPassword("123456");
        users.add(u1);
    }
    public static User checkLogin(Login login){
        for(User u: users){
//            neu account tontai && matkhau dung => tra ve users
            if(u.getAccount().equals(login.getAccount()) && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
