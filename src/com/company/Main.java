package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ifOn();
        questions();

    }

    public static void ifOn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите всой возраст");
        int age = sc.nextInt();
        if (age < 10) {
            System.out.println("ребёнок");
        } else if (age > 10) {
            System.out.println("подросток");
        } else if (age > 18) {
            System.out.println("взрослый человек");
        }
    }

    public static void questions() {
        Scanner scannerGolod = new Scanner(System.in);
        System.out.println("вы голодный");
        boolean golod = scannerGolod.nextBoolean();
        Scanner scannerDz = new Scanner(System.in);
        System.out.println("ты сделал дз");
        boolean dz = scannerDz.nextBoolean();
    }

    public static void umn(int num1,int num2){
        return;

    }
}

