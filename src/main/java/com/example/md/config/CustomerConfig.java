package com.example.md.config;


import com.example.md.entity.Customer;
import com.example.md.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CustomerConfig {

    @Bean
    CommandLineRunner runner(CustomerRepository repository){
        return  args -> {
           
        };
    }
}
