package ru.project.spring_boot_app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.project.spring_boot_app.model.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserDAO extends CrudRepository<User, Long> {
}
