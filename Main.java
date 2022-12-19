package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {


//    Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(rnd.nextInt(1, 10));
        }

        LinkedList<Integer> reversList = new LinkedList<>();
        for (Integer i : list) {
            reversList.add(i);
        }

        int i = 0;
        while (i != reversList.size() - 1) {
            reversList.add(reversList.size()-i, reversList.getFirst());
            reversList.removeFirst();
            i++;
        }
        System.out.println("linkList случайных чисел от 1 до 10: ");
        System.out.println(list);
        System.out.println("Revers linkList: ");
        System.out.println(reversList);

    }

}
