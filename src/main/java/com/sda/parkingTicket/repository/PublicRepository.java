package com.sda.parkingTicket.repository;

import com.sda.parkingTicket.model.Public;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PublicRepository extends JpaRepository<Public, Long> {

    Optional<Public> findById(Long id);

}
