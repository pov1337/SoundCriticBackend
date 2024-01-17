package ru.pet.soundcritic.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.pet.soundcritic.entities.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
