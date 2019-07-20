package com.sda.parkingTicket.service;

import com.sda.parkingTicket.dto.PublicDto;
import com.sda.parkingTicket.model.Subscription;
import com.sda.parkingTicket.repository.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Service
public class SubscriptionService {

    @Autowired
    SubscriptionRepository subscriptionRepository;

    public boolean isValid(String code) {
        Subscription subscription = subscriptionRepository.findByCode(code).orElse(null);
        if (subscription == null) {
            return false;
        }

        if (subscription.getStartDate().after(Timestamp.valueOf(LocalDateTime.now()))) {
            return false;
        }

        if (subscription.getEndDate().before(Timestamp.valueOf(LocalDateTime.now()))) {
            return false;
        }

        return true;
    }

    public PublicDto createSubscription(PublicDto publicDto) {

        Subscription subscription = new Subscription();
        subscription.setCode(generateSubscriptionCode());

        subscription.setStartDate(new Timestamp(publicDto.getStartDate().getTime()));
        subscription.setEndDate(new Timestamp((publicDto.getEndDate().getTime())));

        subscriptionRepository.save(subscription);

        PublicDto result = new PublicDto();
        result.setCode(subscription.getCode());
        return result;
    }

    private String generateSubscriptionCode() {
        return "S" + (long) (Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000);
    }
}
