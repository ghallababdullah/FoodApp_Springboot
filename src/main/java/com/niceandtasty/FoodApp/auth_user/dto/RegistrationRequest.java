package com.niceandtasty.FoodApp.auth_user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
public class RegistrationRequest {
    @NotBlank(message = "Name is required")
    private String name ;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email")
    private String email ;

    @NotBlank(message = "Password is required")
    @Size(min = 8 , message = "Password must be atleast 8 charchters long")
    private String password ;

    @NotBlank(message = "Address is required")
    private String address ;

    @NotBlank(message = "Phone Number is required")
    private String phoneNumber ;

    private List<String> roles ;



}
