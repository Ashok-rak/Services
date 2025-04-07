package com.auth.service;

import com.auth.service.DTO.LoginDto;

public interface AuthService {
    String login(LoginDto loginDto);
}