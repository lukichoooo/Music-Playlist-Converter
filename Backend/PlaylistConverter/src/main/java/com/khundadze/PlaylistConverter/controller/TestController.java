package com.khundadze.PlaylistConverter.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/home")
public class TestController {

    @GetMapping("/")
    public String home(@AuthenticationPrincipal OAuth2User user) {
        return "Hello, " + (user != null ? user.getAttribute("display_name") : "guest");
    }
}
