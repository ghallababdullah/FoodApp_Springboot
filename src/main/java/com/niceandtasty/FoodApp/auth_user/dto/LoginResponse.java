package com.niceandtasty.FoodApp.auth_user.dto;


import lombok.Data;

import java.util.List;

@Data
public class LoginResponse {

    private String token ;
    private List<String> roles ;



}
