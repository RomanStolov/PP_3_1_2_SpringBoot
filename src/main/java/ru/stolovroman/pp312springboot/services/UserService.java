package ru.stolovroman.pp312springboot.services;

import ru.stolovroman.pp312springboot.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(Long id);

    void updateUser(User newUser);

    void deleteUser(Long id);

}
