package com.kodluyoruz.WeekThreeSpring.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Scanner;

public class InputService {
    private final Scanner scanner;

    public InputService(Scanner inScanner) {
        this.scanner = inScanner;
    }

    public void testInput(){
        System.out.println("Test Input: ");
        String input = scanner.nextLine();
        System.out.println("Test Input: " + input);
    }

}
