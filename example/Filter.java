package org.example;
import java.util.*;

public class Filter {
    public static void main(String[] args) {

        Laptop l1 = new Laptop(1, 4, 128, "Windows 10", "Черный");
        Laptop l2 = new Laptop(2, 8, 256, "Windows 11", "Красный");
        Laptop l3 = new Laptop(3, 16, 256, "Linux", "Серый");
        Laptop l4 = new Laptop(4, 16, 512, "Windows 10", "Белый");
        Laptop l5 = new Laptop(5, 16, 512, "macOS", "Красный");
        Laptop l6 = new Laptop(6, 32, 512, "Windows 11", "Белый");
        Laptop l7 = new Laptop(7, 32, 512, "linux", "Серый");
        Laptop l8 = new Laptop(8, 64, 1024, "Windows 10", "Серый");
        Laptop l9 = new Laptop(9, 64, 1024, "macOS", "Красный");
        Laptop l10 = new Laptop(10, 64, 1024, "Windows 11", "Черный");


        System.out.println("Программа отфильтрует ноутбук по параметрам:");
        System.out.println("Выберите фильтр");
        System.out.println("[1] - фильтр по ОЗУ");
        System.out.println("[2] - фильтр по SSD");
        System.out.println("[3] - фильтр по OS");
        System.out.println("[4] - фильтр по цвету");
        Scanner sc = new Scanner(System.in);
        Integer filter = sc.nextInt();

        switch (filter) {
            case 1:
                System.out.printf("Введите значение ОЗУ: ");
                System.out.println("Доступны варианты [4], [8], [16], [32], [64] Gb");
                    Integer ram = sc.nextInt();
                System.out.println("Выбраны ноутбуки с ОЗУ [" + ram + " Gb]");
                    if (ram == 4) {
                        System.out.printf(l1.toString());
                    } else if (ram == 8) {
                        System.out.printf(l2.toString());
                    } else if (ram == 16) {
                        System.out.printf(l3.toString() + "\n" + l4.toString() + "\n" + l5.toString());
                    } else if (ram == 32) {
                        System.out.printf(l6.toString() + "\n" + l7.toString());
                    } else if (ram == 64) {
                        System.out.printf(l8.toString()+ "\n" + l9.toString() + "\n" + l10.toString());
                    } else System.out.println("Параметр выбран некорректно");

            case 2:
                System.out.println("\n");
                System.out.printf("Введите значение SSD: ");
                System.out.println("Доступны варианты [128], [256], [512], [1024] Gb");
                    Integer ssd = sc.nextInt();
                System.out.println("Выбраны ноутбуки с SSD [" + ssd + " Gb]");
                    if (ssd == 128) {
                        System.out.printf(l1.toString());
                    } else if (ssd == 256) {
                        System.out.printf(l2.toString() + "\n" + l3.toString());
                    } else if (ssd == 512) {
                        System.out.printf(l4.toString() + "\n" + l5.toString() + "\n" + l6.toString() + "\n" + l7.toString());
                    } else if (ssd == 1024) {
                        String format = l8.toString() + "\n" + l9.toString() + "\n" + l10.toString();
                        System.out.printf(format);
                    } else System.out.println("Параметр выбран некорректно");

            case 3:
                System.out.println("\n");
                System.out.printf("Введите значение OS: ");
                System.out.println("Доступны варианты [Windows] = 1, [Windows 10] = 2, [Windows 11] = 3, [macOS] = 4, [linux] = 5");
                System.out.println("Укажите OS или её номер: ");
                    Scanner sc1 = new Scanner(System.in);
                    String os = sc1.nextLine();

                    if (os.equals("Windows") || os.equals("1")) {
                        System.out.println("Выбраны ноутбуки с OS [Windows]");
                        System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString() + "\n" + l6.toString() + "\n" + l8.toString() + "\n" + l10.toString());
                    } else if (os.equals("Windows 10") || os.equals("2")) {
                        System.out.println("Выбраны ноутбуки с OS [Windows 10]");
                        System.out.printf(l1.toString() + "\n" + l4.toString() + "\n" + l8.toString());
                    } else if (os.equals("Windows 11") || os.equals("3")) {
                        System.out.println("Выбраны ноутбуки с OS [Windows 11]");
                        System.out.printf(l2.toString() + "\n" + l6.toString() + "\n" + l10.toString());
                    } else if (os.equals("Linux") || os.equals("5")) {
                        System.out.println("Выбраны ноутбуки с OS [Linux]");
                        System.out.printf(l3.toString() + "\n" + l7.toString());
                    } else if (os.equals("macOS") || os.equals("4")) {
                        System.out.println("Выбраны ноутбуки с OS [macOS]");
                        System.out.printf(l5.toString() + "\n" + l9.toString());
                    }  else System.out.println("Параметр выбран некорректно");

            case 4:
                System.out.println("\n");
                System.out.println("Введите название цвета");
                System.out.println("Доступны варианты [Черный] = 1, [Красный] = 2, [Серый] = 3, [Белый] = 4");
                System.out.println("Укажите цвет или его номер: ");
                    Scanner sc2 = new Scanner(System.in);
                    String color = sc2.nextLine();
                    if (color.equals("Черный") || color.equals("1")) {
                        System.out.println("Выбраны ноутбуки [Черного цвета]");
                        System.out.printf(l1.toString() + "\n" + l10.toString());
                    } else if (color.equals("Красный") || color.equals("2")) {
                        System.out.println("Выбраны ноутбуки [Красного цвета]");
                        System.out.printf(l2.toString() + "\n" + l5.toString() + "\n" + l9.toString());
                    } else if (color.equals("Серый") || color.equals("3")) {
                        System.out.println("Выбраны ноутбуки [Серого цвета]");
                        System.out.printf(l3.toString() + "\n" + l7.toString() + "\n" + l8.toString());
                    } else if (color.equals("Белый") || color.equals("4")) {
                        System.out.println("Выбраны ноутбуки [Белого цвета]");
                        System.out.println(l4.toString() + "\n" + l6.toString());
                    } else System.out.println("Параметр выбран некорректно");

        }
        sc.close();
    }
}



