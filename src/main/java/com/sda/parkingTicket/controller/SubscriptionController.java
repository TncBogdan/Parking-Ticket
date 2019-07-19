package com.sda.parkingTicket.controller;

import com.sda.parkingTicket.dto.PublicDto;
import com.sda.parkingTicket.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SubscriptionController {

    @Autowired
    private SubscriptionService subscriptionService;

    @RequestMapping(value = {"/subscriptionAccess"}, method = RequestMethod.GET)
    public String create(Model model) {
        PublicDto publicDto = subscriptionService.createSubscription();
        model.addAttribute("subscriptionCodeMessage", publicDto.getCode());
        return "accessParking";
    }
}
