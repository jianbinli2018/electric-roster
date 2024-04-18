package com.algostudioapp.service;

import com.algostudioapp.exception.UserNotFoundException;
import com.algostudioapp.model.AlgoUser;
import com.algostudioapp.repository.AlgoUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AlgoUserService {
    @Autowired
    private AlgoUserRepository userRepository;

    public AlgoUser fetchUser(String username){
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new UserNotFoundException("User not found with username: " + username));
    }

    public AlgoUser fetchUser(UUID uuid){
        return userRepository.findById(uuid)
                .orElseThrow(() -> new UserNotFoundException("User not found with uuid: " + uuid));
    }

    public AlgoUser createUser(AlgoUser user){
        return userRepository.save(user);
    }
}
