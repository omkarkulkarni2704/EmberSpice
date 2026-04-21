package com.omkar.restaurantsite.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                    .requestMatchers(
                            "/",
                            "/menu",
                            "/booking",
                            "/login",
                            "/cart",
                            "/orders",
                            "/add-to-cart",
                            "/add-review",
                            "/css/**",
                            "/images/**"
                    ).permitAll()
                    .requestMatchers("/admin/**", "/update-status/**").permitAll()
                    .anyRequest().authenticated()
            )
            .formLogin(form -> form
                    .loginPage("/login")
                    .defaultSuccessUrl("/", true)
                    .permitAll()
            )
            .logout(logout -> logout
                    .logoutSuccessUrl("/")
                    .permitAll()
            );

        return http.build();
    }
}