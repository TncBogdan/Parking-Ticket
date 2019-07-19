package com.sda.parkingTicket.repository;

import com.sda.parkingTicket.model.Subscription;
import com.sda.parkingTicket.model.Ticket;
import com.sda.parkingTicket.model.User;
import javafx.scene.input.DataFormat;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.List;
import java.util.Optional;
import java.util.zip.DataFormatException;

@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {

    Optional<Subscription> findById(Long id);
    void deleteById(Long id);
    Optional<Subscription> findByCode(String code);
}
