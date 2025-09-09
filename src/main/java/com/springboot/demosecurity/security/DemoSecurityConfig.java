package com.springboot.demosecurity.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class DemoSecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){


        UserDetails Erdogan = User.builder()
                .username("Erdogan")
                .password("{noop}test123")
                .roles("EMPLOYEE")
                .build();


        UserDetails Ahmet = User.builder()
                .username("Ahmet")
                .password("{noop}test123")
                .roles("EMPLOYEE","MANAGER")
                .build();


        UserDetails Hasan = User.builder()
                .username("Hasan")
                .password("{noop}test123")
                .roles("EMPLOYEE","MANAGER","ADMIN")
                .build();

        return new InMemoryUserDetailsManager(Erdogan,Ahmet,Hasan);
    }
}













