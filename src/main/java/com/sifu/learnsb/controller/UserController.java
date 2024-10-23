package com.sifu.learnsb.controller;

import com.sifu.learnsb.dto.request.UserCreationRequest;
import com.sifu.learnsb.dto.request.UserUpdateRequest;
import com.sifu.learnsb.model.User;
import com.sifu.learnsb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    User createUser(@RequestBody UserCreationRequest request) {
        return userService.createUser(request);
    }

    @GetMapping
    List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{userId}")
    User getUser(@PathVariable("userId") Long userId) {
        return userService.getUser(userId);
    }

    @PutMapping("/{userId}")
    User updateUser(@PathVariable Long userId, @RequestBody UserUpdateRequest request){
        return userService.updateUser(userId,request);
    }

    @DeleteMapping("/{userId}")
    String deleteUser(@PathVariable("userId") Long userId) {
        userService.deleteUser(userId);
        return "User deleted";
    }
}
