package com.sda.parkingTicket.repository;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
