package com.company;

public class Main {

    public static void main(String[] args) {
	// Задача 1
        System.out.println("Задача 1");
        byte clientOS=0;
        if (clientOS==0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS==1) {

            System.out.println("Установите версию приложения для Android по ссылке");
    }

        //Задача 2
        System.out.println("Задача 2");
        byte clientOS2=0;
        short clientDeviceYear=2010;

        if (clientOS2==0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }

        if (clientOS2==1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        // Задача 3
        System.out.println("Задача 3");
        short year=1996;
        if ((year%4==0)||(year%400==0)) {
          System.out.println(year+" год является високосным.");
        }else{
            System.out.println(year+" год  не является високосным.");
        }

        //Задача 4
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryDays=0;
        if (deliveryDistance<=20) {
            deliveryDays=1;
        }
        if (deliveryDistance>=21 && deliveryDistance<=60) {
            deliveryDays=2;
        }
        if (deliveryDistance>=61 && deliveryDistance<=100) {
            deliveryDays=3;
        }
        System.out.println("Потребуется дней: "+deliveryDays);

        //Задача 5
        System.out.println("Задача 5");
        int monthNumber=13;
        switch (monthNumber) {
            case 1:
            case 2:
                System.out.println("Зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень.");
                break;
            case 12:
                System.out.println("Зима.");
                break;
            default:
                System.out.println("Такого месяца не существует.");

        }
}
}
