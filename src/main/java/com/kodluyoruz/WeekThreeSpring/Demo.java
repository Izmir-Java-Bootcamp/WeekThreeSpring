package com.kodluyoruz.WeekThreeSpring;

import com.kodluyoruz.WeekThreeSpring.service.InputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.Scanner;

//@Service
@Component
//@Bean
public class Demo implements CommandLineRunner {
    @Autowired
    private Scanner scanner;

    @Autowired
    private InputService service;

    @Override
    public void run(String... args) throws Exception {


        System.out.println("Lütfen input giriniz");
        String input = scanner.nextLine();
        System.out.println("Input: " + input);

        inputTaker();
        service.testInput();

    }

    private void inputTaker() {
        System.out.println("Input 2: ");
        String input = scanner.nextLine();
        System.out.println("Input2: " + input);
    }
}
