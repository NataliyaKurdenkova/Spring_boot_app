package ru.project.spring_boot_app.service;

import ru.project.spring_boot_app.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();

    Optional<User> getUserById(long id);

    void saveUser(User user);

    void deleteUser(long id);
}