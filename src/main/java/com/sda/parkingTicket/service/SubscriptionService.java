package com.sda.parkingTicket.service;

import com.sda.parkingTicket.dto.PublicDto;
import com.sda.parkingTicket.model.Subscription;
import com.sda.parkingTicket.model.Ticket;
import com.sda.parkingTicket.repository.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.auditing.CurrentDateTimeProvider;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

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

    public PublicDto createSubscription(){

        Subscription subscription = new Subscription();
        subscription.setCode(generateSubscriptionCode());
        subscription.setStartDate(new Timestamp(new Date().getTime()));
        subscription.setEndDate(new Timestamp((new Date().getTime())));

        subscriptionRepository.save(subscription);

        PublicDto publicDto = new PublicDto();
        publicDto.setCode(subscription.getCode());
        return publicDto;
    }

    private String generateSubscriptionCode(){
        return "S" + (long) (Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000);
    }
}
