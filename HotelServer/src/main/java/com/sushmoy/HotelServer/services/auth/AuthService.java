package com.sushmoy.HotelServer.services.auth;


import com.sushmoy.HotelServer.dto.SignupRequest;
import com.sushmoy.HotelServer.dto.UserDto;

public interface AuthService {
    UserDto createUser(SignupRequest signupRequest);
}
