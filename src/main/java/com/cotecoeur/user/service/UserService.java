package com.cotecoeur.user.service;

import com.cotecoeur.user.model.User;
import com.cotecoeur.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository ur;

    public User findByEmail(String email) {
        return ur.findByEmail(email);
    }
}
