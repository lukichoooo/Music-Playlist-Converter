package com.khundadze.PlaylistConverter.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().authenticated() // require login everywhere
                )
                .oauth2Login(oauth2 -> oauth2
                        .loginPage("/oauth2/authorization/google") // force Google login
                        .defaultSuccessUrl("/loginSuccess", true));

        return http.build();
    }
}
