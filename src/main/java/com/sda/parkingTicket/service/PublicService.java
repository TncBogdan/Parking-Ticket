package com.sda.parkingTicket.service;

import com.sda.parkingTicket.model.Public;
import com.sda.parkingTicket.repository.PublicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PublicService {
    @Autowired
    private PublicRepository publicRepository;

    public Public findById(Long id){
        Optional<Public> publicMessage= publicRepository.findById(id);
        return publicMessage.orElse(null);
    }

}
