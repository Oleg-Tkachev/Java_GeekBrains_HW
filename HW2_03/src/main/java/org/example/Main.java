package org.example;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
            int arr[] = {3, 4, 2, 7, 5, 9, 1, 6, 8};
            int temp = 0;

        try (PrintWriter out = new PrintWriter("logSort.txt")) {
            for (int i = arr.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        out.println(Arrays.toString(arr));
                    }
                }
            }
        System.out.println("Сортированный массив");
        System.out.println(Arrays.toString(arr));
        logger.info("Содержимое записано в файл logSort.txt");
        } catch (FileNotFoundException e) {
        logger.info(e.getMessage());
        }
    }
}


