package ex16;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 justin gesek
 */
import java.util.Scanner;

import java.lang.Math;
//What is your age? 15
//You are not old enough to legally drive.
//What is your age? 35
//You are old enough to legally drive.
public class ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your age? ");
        long age = scanner.nextLong();


        if(age >= 16)
        {
            System.out.println("You are old enough to legally drive.");
        }
        else {
            System.out.println("You are not old enough to legally drive.");
        }
    }
}