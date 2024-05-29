package com.spring_auth.demo.web.payload.request;


import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter
public class SignUpRequest {
    public String username;
    public String password;
    public String email;
    public String phone_number;
    public Set<String> roles;
}
