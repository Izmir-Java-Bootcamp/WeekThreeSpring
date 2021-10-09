package com.kodluyoruz.WeekThreeSpring.service;

import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class InputService {
    private Scanner scanner;

    public InputService(Scanner scanner) {
        this.scanner = scanner;
    }

    public void testInput(){
        System.out.println("Test Input: ");
        String input = scanner.nextLine();
        System.out.println("Test Input: " + input);
    }

}
