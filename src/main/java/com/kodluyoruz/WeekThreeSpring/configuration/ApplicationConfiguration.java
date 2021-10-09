package com.kodluyoruz.WeekThreeSpring.configuration;

import com.kodluyoruz.WeekThreeSpring.service.InputService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import java.util.Scanner;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public InputService inputService(Scanner inScanner){
        return new InputService(inScanner);
    }
}
