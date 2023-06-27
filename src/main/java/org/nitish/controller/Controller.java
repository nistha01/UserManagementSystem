package org.nitish.controller;

import org.nitish.model.User;
import org.nitish.repo.Repo.Repo;
import org.nitish.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class Controller {
  @Autowired
 Service service;

@GetMapping("users")
 public List<User> getAlluser(){
     return service.getAllUser();
 }
 @PostMapping("users")
 public String addallUser(@RequestBody List<User> userList){

     return service.addAlluser(userList);
 }
 @GetMapping("users/userId/{userId}")
 public User getUserById( @PathVariable Integer userId){
     return service.getUserById(userId);
 }
@PostMapping("users/userId/{userId}")
 public String updateUserInfo(@PathVariable Integer userId, @RequestBody User user){
     return service.updateUserInfo(userId,user);
 }
 @DeleteMapping("user/userId/{userId}")
 public String deleteuser(@PathVariable Integer userId){
     return service.deleteUser(userId);
 }

}
