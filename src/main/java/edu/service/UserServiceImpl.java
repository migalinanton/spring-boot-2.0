package edu.service;

import edu.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;

    public UserServiceImpl() {
    }

    @Override
    public Optional<User> getUser(String name) {
        return repository.getUserByName(name);
    }

}
