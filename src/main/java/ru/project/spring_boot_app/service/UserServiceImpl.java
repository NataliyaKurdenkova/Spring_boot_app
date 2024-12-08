package ru.project.spring_boot_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.project.spring_boot_app.dao.UserDAO;
import ru.project.spring_boot_app.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDao) {
        this.userDAO = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        Iterable<User> allUsers = userDAO.findAll();
        List<User> users = new ArrayList<>();
        allUsers.forEach(users::add);
        return users;
    }

    @Override
    public Optional<User> getUserById(long id) {
        return userDAO.findById(id);
    }

    @Override
    public void saveUser(User user) {
        userDAO.save(user);
    }

    @Override
    public void deleteUser(long id) {
        Optional<User> userById = userDAO.findById(id);
        userDAO.delete(userById.get());
    }
}