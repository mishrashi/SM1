package com.Jwtexp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


import com.Jwtexp.models.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private List<User> store = new ArrayList<>();



    public List<User> getusers() {

        return this.store;
    }
}
