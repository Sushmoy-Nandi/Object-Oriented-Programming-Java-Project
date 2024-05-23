package com.sushmoy.HotelServer.dto;

import com.sushmoy.HotelServer.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {
    private  Long id;
    private String email;
    private String Name;
    private UserRole userRole;
}
