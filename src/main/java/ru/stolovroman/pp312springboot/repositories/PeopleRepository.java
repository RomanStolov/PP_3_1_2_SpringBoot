package ru.stolovroman.pp312springboot.repositories;

import ru.stolovroman.pp312springboot.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends JpaRepository<User, Long> {

}
