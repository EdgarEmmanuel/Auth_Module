package com.spring_auth.demo.web.payload.response;

import com.spring_auth.demo.models.ERole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class JwtResponse {
    public String token;
    public Long id;
    public String username;
    public String email;
    public List<String> roles;

}
