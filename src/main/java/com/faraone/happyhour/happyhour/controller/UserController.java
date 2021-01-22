package com.faraone.happyhour.happyhour.controller;

import com.faraone.happyhour.happyhour.dto.LoginRequestDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {

    @PostMapping("/login")
    public String login(@RequestBody LoginRequestDTO loginRequestDTO) {
        return "u made it son of a ***";
    }
}
