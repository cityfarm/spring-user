package com.sifu.learnsb.service;

import com.sifu.learnsb.dto.request.UserCreationRequest;
import com.sifu.learnsb.dto.request.UserUpdateRequest;
import com.sifu.learnsb.model.User;
import com.sifu.learnsb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(UserCreationRequest request) {
        User user = new User();
        user.setName(request.getName());
        user.setBirthday(request.getBirthday());
        user.setSalary(request.getSalary());
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());

        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUser(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    public User updateUser(Long userId,UserUpdateRequest request) {
        User user = getUser(userId);

        user.setName(request.getName());
        user.setBirthday(request.getBirthday());
        user.setSalary(request.getSalary());
        user.setPassword(request.getPassword());

        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
