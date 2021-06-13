/*
 *  UCF COP3330 Summer 2021 Assignment 28 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner jb = new Scanner(System.in);
        int sonk = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int number = jb.nextInt();
            sonk = sonk + number;
        }
        System.out.println("The total is " + sonk);
    }
}

