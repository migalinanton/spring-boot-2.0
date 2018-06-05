package edu.service;

import edu.domain.User;

import java.util.Optional;

public interface UserService {

    Optional<User> getUser(String name);

}
