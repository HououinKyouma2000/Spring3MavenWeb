package com.example.demo.config.service;

import com.example.demo.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
    // V1
    @Autowired
    private UserRepo userRepo;

    /* V2 Analo Autowired
    private final UserRepo userRepo;

    public UserService(UserRepo userRepo){
        this.userRepo=userRepo;
    }

     */

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepo.findByUsername(username);
    }
}
