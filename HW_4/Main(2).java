package org.example;

import java.util.LinkedList;

public class Main {

//    Реализуйте очередь с помощью LinkedList со следующими методами:
//    enqueue() - помещает элемент в конец очереди,
//    dequeue() - возвращает первый элемент из очереди и удаляет его,
//    first() - возвращает первый элемент из очереди, не удаляя.
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 8, 7, 9, 2,};

        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        int number = 77; // элемент в конец списка

        System.out.println("Основная очередь: ");
        System.out.println(list);


        enqueue(list, number);
        System.out.println("Метод <enqueue>, элемент " + number + " добавлен в конец очереди:");
        System.out.println(list);

        System.out.println("Метод <dequeue>, возвращает первый элемент из очереди [" + dequeue(list) + "] и удаляет его.");
        System.out.println("Очередь после метода <dequeue>:");
        System.out.println(list);

        System.out.println("Метод <first>, возвращает первый элемент из очереди [" + first(list) + "] не удаляя его.");
        System.out.println("Очередь после метода <first>:");
        System.out.println(list);
    }

    public static void enqueue(LinkedList<Integer> arr, int num) {
        arr.add(num);
    }

    public static int dequeue(LinkedList<Integer> arr) {
        int number = 0;
        number = arr.get(0);
        arr.remove(0);
        return number;
    }

    public static int first(LinkedList<Integer> arr) {
        int number = 0;
        number = arr.get(0);
        return number;
    }

}

//        Основная очередь:
//        [3, 4, 5, 1, 8, 7, 9, 2]
//        Метод <enqueue>, элемент 77 добавлен в конец очереди:
//        [3, 4, 5, 1, 8, 7, 9, 2, 77]
//        Метод <dequeue>, возвращает первый элемент из очереди [3] и удаляет его.
//        Очередь после метода <dequeue>:
//        [4, 5, 1, 8, 7, 9, 2, 77]
//        Метод <first>, возвращает первый элемент из очереди [4] не удаляя его.
//        Очередь после метода <first>:
//        [4, 5, 1, 8, 7, 9, 2, 77]
//
//        Process finished with exit code 0