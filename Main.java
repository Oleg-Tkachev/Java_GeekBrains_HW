package org.example;

import java.util.*;
import java.util.ArrayList;
import java.util.Random;


public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 7, 9, 4, 6, 5, 8};
        int n = arr.length;
        System.out.println("Массив до сортировки: ");
        System.out.println(Arrays.toString(arr));
        SortMerge(arr, 0, n - 1);
        System.out.println("Массив после сортировки методом SortMerge: ");
        System.out.println(Arrays.toString(arr));


        DellEvenNumbers();
        MinMaxMean();
    }


    //  Реализовать алгоритм сортировки слиянием

    static void SortMerge(int a[], int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            SortMerge(a, beg, mid);
            SortMerge(a, mid + 1, end);
            merge(a, beg, mid, end);
        }
    }

    static void merge(int x[], int y, int mid, int end) {
        int i = 0;
        int j = 0;
        int k = 0;

        int n1 = mid - y + 1;
        int n2 = end - mid;

        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        for (i = 0; i < n1; i++)
            arr1[i] = x[y + i];
        for (j = 0; j < n2; j++)
            arr2[j] = x[mid + 1 + j];

        i = 0;
        j = 0;
        k = y;

        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                x[k] = arr1[i];
                i++;
            } else {
                x[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            x[k] = arr1[i];
            i++;
            k++;
        }

        while (j < n2) {
            x[k] = arr2[j];
            j++;
            k++;
        }
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //  Дан произвольный список целых чисел, удалить из него четные числа

        private static void DellEvenNumbers () {        //  удаление из массива четных числ
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

////////////////////////////////////////////////////////////////////////////////////////////////////////

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

/////////////////////////////////////////////////////////////////////////////////////////////////////////////