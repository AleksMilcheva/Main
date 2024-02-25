package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Please enter your username:");
        String userName = scanner.nextLine();

        System.out.println ("Please enter your hobby:");
        String hobby = scanner.nextLine();

        System.out.println ("Nice to meet you," + userName +". Your hobby is: "+ hobby + "!" );
    }
}