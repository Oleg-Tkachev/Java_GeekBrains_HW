package org.example;

import java.util.*;

//      Пусть дан список сотрудников:
//      Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
//      Отсортировать по убыванию популярности.

public class DuplicateNames {
    public static void main(String[] args) {
        Map<String, Integer> nameMap = new HashMap<>();

        String employees = "Иван Иванов " +
                "Светлана Петрова " +
                "Кристина Белова " +
                "Анна Мусина " +
                "Анна Крутова " +
                "Иван Юрин " +
                "Петр Лыков " +
                "Павел Чернов " +
                "Петр Чернышов " +
                "Мария Федорова " +
                "Марина Светлова " +
                "Мария Савина " +
                "Мария Рыкова " +
                "Марина Лугова " +
                "Анна Владимирова " +
                "Иван Мечников " +
                "Петр Петин " +
                "Иван Ежов ";

        String[] contact = employees.split(" ");
        for (int i = 0; i < contact.length; i += 2) {
            if (nameMap.containsKey(contact[i])) {
                nameMap.replace(contact[i], nameMap.get(contact[i]) + 1);
            } else {
                nameMap.put(contact[i], 1);
            }
        }
        System.out.println("Повторяющиеся имена:");
        System.out.println(nameMap);

        Map<String, Integer> sortedNameMap = new LinkedHashMap<>();
        int max = 1;
        for (int value : nameMap.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : nameMap.entrySet()) {
                String key = entry.getKey();
                if (nameMap.get(key) == i) {
                    sortedNameMap.put(key, nameMap.get(key));
                }
            }
        }
        System.out.println("Список имен по убыванию:");
        System.out.println(sortedNameMap);
    }
}


//    Повторяющиеся имена:
//        {Мария=3, Марина=2, Светлана=1, Кристина=1, Анна=3, Иван=4, Петр=3, Павел=1}
//    Список имен по убыванию:
//        {Иван=4, Мария=3, Анна=3, Петр=3, Марина=2, Светлана=1, Кристина=1, Павел=1}
//
//    Process finished with exit code 0
