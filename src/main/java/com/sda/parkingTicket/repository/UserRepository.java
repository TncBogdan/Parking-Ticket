package com.sda.parkingTicket.repository;

import com.sda.parkingTicket.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findById(Long id);
    List<User> findAll();
    List<User> findAllByUsername(String username);
    User findByUsername(String userName);
    void deleteById(Long id);

}
