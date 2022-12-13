package org.example;

import java.util.*;
import java.util.ArrayList;
import java.util.Random;


public class Main {

    public static void main(String[] args) {

        DellEvenNumbers();
        MinMaxMean();

        //  Реализовать алгоритм сортировки слиянием
    }
    private static void SortMerge() {




    }

    //  Пусть дан произвольный список целых чисел, удалить из него четные числа

    private static void DellEvenNumbers(){
        Random rnd = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(rnd.nextInt(1, 100));
        }
        System.out.println("20 случайных чисел от 1 до 100: ");
        System.out.println(list);
        int index = 0;
        while (index < list.size()) {
            if (list.get(index) % 2 == 0) {
                list.remove(index);
            } else {
                index++;
            }
        }
        System.out.println("Список уже без четных чисел: ");
        System.out.println(list);
    }


    //  Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

    private static void MinMaxMean() {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(random.nextInt(1, 100));
        int max = list.get(0), min = list.get(0);
        double sum = list.get(0);
        for (int i = 1; i < 20; i++) {
            list.add(random.nextInt(1, 100));
        }

        System.out.println("20 случайных чисел от 1 до 100: ");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("Сортированный массив по возрастанию: ");
        System.out.println(list);

        int minNum = list.get(0);
        System.out.println("Минимальный элемент: " + '['+ minNum +']');

        int maxNum = list.get(list.size()-1);
        System.out.println("Максимальный элемент массива: " + '['+ maxNum +']');

        double mean = minNum+maxNum/2;
        System.out.println("Среднее значение между мин и мах элементами: " + '['+ mean +']');

    }
}