package com.sda.parkingTicket.service;

import com.sda.parkingTicket.model.Subscription;
import com.sda.parkingTicket.model.Ticket;
import com.sda.parkingTicket.repository.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.auditing.CurrentDateTimeProvider;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@Service
public class SubscriptionService {

    @Autowired
    SubscriptionRepository subscriptionRepository;

    public boolean isValid(String code) {
        Subscription subscription = subscriptionRepository.findByCode(code).orElse(null);
        if (subscription == null) {
            return false;
        }

        if (subscription.getEndDate().after(Timestamp.valueOf(LocalDateTime.now()))) {
            return true;
        }

        return false;
    }
}
