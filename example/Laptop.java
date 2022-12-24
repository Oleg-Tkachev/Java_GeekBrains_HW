package org.example;


//      1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//      2. Создать множество ноутбуков.
//      3. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
//      отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
//      “Введите цифру, соответствующую необходимому критерию:
//      1 - ОЗУ
//      2 - Объем ЖД
//      3 - Операционная система
//      4 - Цвет …
//      1. Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//      2. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.


public class Laptop {
    int id;
    int ram;
    int ssd;
    String os;
    String color;

    public Laptop(int id, int ram, int ssd, String os, String color){
        this.id = id;
        this.ram = ram;
        this.ssd = ssd;
        this.os = os;
        this.color = color;
    }

    public String toString() {
        return String.format("id: %d, ram: %d ГБ, ssd: %d ГБ, OS: %s, color: %s", id, ram, ssd, os, color);
    }

    public boolean equals(Object o) {
        Laptop t = (Laptop) o;
        return id == t.id;
    }
}



/*
        Программа отфильтрует ноутбук по параметрам:
        Выберите фильтр
        [1] - фильтр по ОЗУ
        [2] - фильтр по SSD
        [3] - фильтр по OS
        [4] - фильтр по цвету
        1
        Введите значение ОЗУ: Доступны варианты [4], [8], [16], [32], [64] Gb
        16
        Выбраны ноутбуки с ОЗУ [16 Gb]
        id: 3, ram: 16 ГБ, ssd: 256 ГБ, OS: Linux, color: Серый
        id: 4, ram: 16 ГБ, ssd: 512 ГБ, OS: Windows 10, color: Белый
        id: 5, ram: 16 ГБ, ssd: 512 ГБ, OS: macOS, color: Красный

        Введите значение SSD: Доступны варианты [128], [256], [512], [1024] Gb
        256
        Выбраны ноутбуки с SSD [256 Gb]
        id: 2, ram: 8 ГБ, ssd: 256 ГБ, OS: Windows 11, color: Красный
        id: 3, ram: 16 ГБ, ssd: 256 ГБ, OS: Linux, color: Серый

        Введите значение OS: Доступны варианты [Windows] = 1, [Windows 10] = 2, [Windows 11] = 3, [macOS] = 4, [linux] = 5
        Укажите OS или её номер:
        3
        Выбраны ноутбуки с OS [Windows 11]
        id: 2, ram: 8 ГБ, ssd: 256 ГБ, OS: Windows 11, color: Красный
        id: 6, ram: 32 ГБ, ssd: 512 ГБ, OS: Windows 11, color: Белый
        id: 10, ram: 64 ГБ, ssd: 1024 ГБ, OS: Windows 11, color: Черный

        Введите название цвета
        Доступны варианты [Черный] = 1, [Красный] = 2, [Серый] = 3, [Белый] = 4
        Укажите цвет или его номер:
        2
        Выбраны ноутбуки [Красного цвета]
        id: 2, ram: 8 ГБ, ssd: 256 ГБ, OS: Windows 11, color: Красный
        id: 5, ram: 16 ГБ, ssd: 512 ГБ, OS: macOS, color: Красный
        id: 9, ram: 64 ГБ, ssd: 1024 ГБ, OS: macOS, color: Красный
        Process finished with exit code 0
