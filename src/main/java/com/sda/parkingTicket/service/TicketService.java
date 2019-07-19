package com.sda.parkingTicket.service;

import com.sda.parkingTicket.dto.PublicDto;
import com.sda.parkingTicket.model.Ticket;
import com.sda.parkingTicket.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public PublicDto createTicket() {

        Ticket ticket = new Ticket();
        ticket.setCode(generateTicketCode());
        ticket.setEnterDate(new Timestamp(new Date().getTime()));

        ticketRepository.save(ticket);

        PublicDto publicDto = new PublicDto();
        publicDto.setCode(ticket.getCode());
        return publicDto;
    }

    private String generateTicketCode() {
        return "T" + (long) (Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000);
    }
}

