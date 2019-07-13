package com.sda.parkingTicket.dto;

import org.springframework.beans.factory.annotation.Autowired;

public class TicketDto {

    private String ticketCode;

    public String getCode() {
        return ticketCode;
    }

    public void setCode(String code) {
        this.ticketCode = code;
    }
}
