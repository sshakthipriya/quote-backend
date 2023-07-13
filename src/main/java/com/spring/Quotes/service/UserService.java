package com.spring.Quotes.service;

import com.spring.Quotes.model.User;
import com.spring.Quotes.respository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRespository userRespository;

    public void saveUser(User theUser)
    {
        userRespository.save(theUser);
    }

}
