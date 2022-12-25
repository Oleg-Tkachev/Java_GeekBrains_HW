package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


//      Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
//      что 1 человек может иметь несколько телефонов.


public class PhoneBook {
    public static HashMap<String, List<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {


        System.out.printf("Введите контакт: ");
        Scanner sc = new Scanner(System.in);
        String contact = sc.next();

        addContact();
        findPhone(contact);

    }

    public static void addContact() {
        phoneBook.put("Иванов", List.of("+7(900)111-11-11", "+7(900)222-22-22"));
        phoneBook.put("Петров", List.of("+7(900)333-33-33", "+7(900)444-44-44"));
        phoneBook.put("Сидоров", List.of("+7(900)555-55-55", "+7(900)666-66-66"));
        phoneBook.put("Пупкин", List.of("+7(900)777-77-77", "+7(900)888-88-88"));
        phoneBook.put("Сергеев", List.of("+7(900)999-99-99"));
    }

    public static void findPhone(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }
}


//    Введите контакт: Петров
//        Петров: [+7(900)333-33-33, +7(900)444-44-44]
//        Process finished with exit code 0
