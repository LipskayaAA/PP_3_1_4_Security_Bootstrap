package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

public interface UserService {
    void saveUser(User user);

    void updateUser(@Valid User user);

    void deleteUser(long id);

    List<User> getAllUsers();

    User getUserByLogin(String login);

    User getUserById(long id);
}


