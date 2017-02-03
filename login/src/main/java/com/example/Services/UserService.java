package com.example.Services;

import com.example.Models.User;
import com.example.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by amladzhov on 2/3/2017.
 */
@Service
public class UserService {
    private static User user;
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void Dosomething(){

    }
}
