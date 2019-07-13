package com.sda.parkingTicket.controller;

import com.sda.parkingTicket.model.Public;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PublicController {

    @RequestMapping(value = {"/parkingAcces"}, method = RequestMethod.POST)
    public String parkingAcces(Model model){
        String message = "Hello";

        model.addAttribute("message", message);
        return "parkingAcces";
    }

}

