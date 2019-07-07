package com.sda.parkingTicket.dto;

import org.springframework.beans.factory.annotation.Autowired;

public class TicketDto {
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
