package com.teachmeskills.homework3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature:");
        int t = input.nextInt();

        if (t > -5) {
            System.out.println("Warm");
        } else if (-5 >= t && t > -20) {
            System.out.println("Normal");
        } else if (-20 >= t) {
            System.out.println("Cold");
        }
    }
}
