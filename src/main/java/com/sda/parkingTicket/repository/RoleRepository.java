package com.sda.parkingTicket.repository;

import com.sda.parkingTicket.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
