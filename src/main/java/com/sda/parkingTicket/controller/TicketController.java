package com.sda.parkingTicket.controller;

import com.sda.parkingTicket.dto.TicketDto;
import com.sda.parkingTicket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TicketController {
    @Autowired
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public TicketService getTicketService() {
        return ticketService;
    }

    public void setTicketService(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @RequestMapping(value = {"/parkingAcces"}, method = RequestMethod.GET)
    public String create(Model model) {
        TicketDto ticketDto = ticketService.createTicket();
        model.addAttribute("ticketCodeMessage", ticketDto.getCode());
        return "parkingAcces";
    }
}
