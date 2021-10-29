package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(generateRandomAge() + " " + contact(generateRandomAge(),10));
        System.out.println(contact(20, 34));
        System.out.println(contact(56, 32));
        System.out.println(contact(37, 8));
        System.out.println(contact(5, 2));
        System.out.println(contact(6, 90));
    }

    public static String contact(int temp, int age) {
        String res = "Можно идти гулять!";
        String res2 = "Остовайтесь дома!";
        if (age >= 20 && age <= 45 && temp >= -20 && temp <= 30) {
            return res;
        } else if (age <= 20 && temp > 0 && temp <= 28) {
            return res;
        } else if (age >= 45 && temp >= -10 && temp <= 25) {
            return res;
        } else
            return res2;
    }

    public static int generateRandomAge() {
        Random random = new Random();
        int age = random.nextInt(100);
        return age;


    }
}