package org.nitish.service;

import org.nitish.model.User;
import org.nitish.repo.Repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    Repo repo;

    public List<User> getAllUser(){
        return repo.userList;
    }
    public String addAlluser(List<User> userList){
        boolean flag =repo.userList.addAll(userList);
        if(flag) return "user Added";
        else
        return "user can't be added";
    }
    public User getUserById(Integer userId){
        for(User user:repo.userList){
        if(user.getUserId().equals(userId))
            return user;

        }
        return null;
    }
    public String updateUserInfo(Integer userId,User user){
        for(User user1:repo.userList){
            if(user1.getUserId().equals(userId)){
                user1.setUserId(user.getUserId());
                user1.setName(user.getName());
                user1.setUserName(user.getUserName());
                user1.setAddress(user.getAddress());
                user1.setContactNo((user.getContactNo()));
                return "user update";
            }
        }
        return "check id";

    }
    public String deleteUser(Integer userId){
        for(User user: repo.userList){
            if(user.getUserId().equals(userId))
                repo.userList.remove(user);
            return "user removed";
        }
        return "invalid Id";
    }



}
