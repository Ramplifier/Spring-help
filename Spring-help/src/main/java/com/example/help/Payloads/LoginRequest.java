package com.example.help.Payloads;


import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class LoginRequest {

    @NotBlank
    private String username;
    @NotBlank
    private String wachtwoord;
}
