package com.sda.parkingTicket.controller;

import com.sda.parkingTicket.dto.PublicDto;
import com.sda.parkingTicket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @RequestMapping(value = {"/parkingAcces"}, method = RequestMethod.GET)
    public String create(Model model) {
        PublicDto publicDto = ticketService.createTicket();
        model.addAttribute("ticketCodeMessage", publicDto.getCode());
        return "accessParking";
    }
}
