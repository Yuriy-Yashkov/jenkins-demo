package com.example;

import java.time.LocalTime;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start: " + LocalTime.now());
        System.out.println("Hello from Jenkins! и Юрий!!!");

        Thread.sleep(20000);

        System.out.println("The end !!!");
        System.out.println("End: " + LocalTime.now());
    }
}