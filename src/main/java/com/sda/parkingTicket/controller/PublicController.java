package com.sda.parkingTicket.controller;

import com.sda.parkingTicket.dto.PublicDto;
import com.sda.parkingTicket.service.SubscriptionService;
import com.sda.parkingTicket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PublicController {

    @Autowired
    private TicketService ticketService;

    @Autowired
    private SubscriptionService subscriptionService;

    @GetMapping(value = "/")
    public String accessPage() {
        return "publicPage";
    }

    @PostMapping(value = {"/access"},
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String accessParking(PublicDto publicDto, Model model) {
        if(StringUtils.isEmpty(publicDto.getCode())) {
            PublicDto generatedTicket = ticketService.createTicket();
            model.addAttribute("message", generatedTicket.getCode());
        } else {
            boolean accessGranted = subscriptionService.isValid(publicDto.getCode());
            model.addAttribute("message", accessGranted ? "Access granted to the parking lot" : "Access denied");
        }

        return "publicPage";
    }
}

