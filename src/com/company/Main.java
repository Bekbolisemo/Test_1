package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ifOn();
        questions();
        System.out.println(umn(5, 5));

    }

    public static void ifOn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите всой возраст");
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("ты подросток");
        } else if (age > 18) {
            System.out.println("ты взрослый");
        }

    }

    public static void questions() {
        {
            Scanner scannerGolod = new Scanner(System.in);
            System.out.println("как вас зовут");
            String name = scannerGolod.nextLine();
            System.out.println("здравствуйте " + name);
        }
        {
            Scanner scannerDz = new Scanner(System.in);
            System.out.println("откудо вы родом");
            String made = scannerDz.nextLine();
            System.out.println("класна я тоже из " + made);
        }
    }

    public static int umn(int num1, int num2) {
        int result = num1 * num2;
        return result;

    }
}

