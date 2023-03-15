package ru.stolovroman.pp312springboot.services;

import ru.stolovroman.pp312springboot.models.User;
import ru.stolovroman.pp312springboot.repositories.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {
    private final PeopleRepository peopleRepository;

    @Autowired
    public UserServiceImpl(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return peopleRepository.findAll();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        peopleRepository.save(user);
    }

    @Override
    public User getUser(Long id) {
        Optional<User> optionalUser = peopleRepository.findById(id);
        return optionalUser.orElse(null);
    }

    @Override
    @Transactional
    public void updateUser(User updatedUser) {
        peopleRepository.save(updatedUser);
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        peopleRepository.deleteById(id);
    }

}
