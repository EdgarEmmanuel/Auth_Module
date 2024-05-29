package com.spring_auth.demo.web.payload.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest {
    public String username;
    public String password;
}
