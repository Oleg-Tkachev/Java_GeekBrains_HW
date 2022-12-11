package org.example;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Logger;


public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        // Реализовать простой калькулятор
        // добавить логирование после кажной операции

        try (PrintWriter out = new PrintWriter("calcLogs.txt")) {
            System.out.print("Введите первое число: ");
            Scanner in = new Scanner(System.in);

            double firstNum = in.nextInt();
            out.println(("Первое число " + firstNum));
            System.out.print("Введите второе число: ");
            double secondNum = in.nextInt();
            out.println(("Первое второе " + secondNum));
            System.out.print("Выберите действие: ");
            String operator = in.next();
            out.println(("Выбран оператор " + operator));
            double result = 0;

            switch (operator) {
                case "/":
                    if (secondNum != 0) {
                        result = firstNum / secondNum;
                        System.out.println("" + firstNum + " / " + secondNum + " = " + result);
                        out.println("" + firstNum + " " + operator + " " + secondNum + " = " + result);
                    } else
                        System.out.println("Неправильный ввод! На ноль делить нельзя");
                    break;
                case "*":
                    result = firstNum * secondNum;
                    System.out.println("" + firstNum + " * " + secondNum + " = " + result);
                    out.println("" + firstNum + " " + operator + " " + secondNum + " = " + result);
                    break;
                case "-":
                    result = firstNum - secondNum;
                    System.out.println("" + firstNum + " - " + secondNum + " = " + result);
                    out.println("" + firstNum + " " + operator + " " + secondNum + " = " + result);
                    break;
                case "+":
                    result = firstNum + secondNum;
                    System.out.println("" + firstNum + " + " + secondNum + " = " + result);
                    out.println("" + firstNum + " " + operator + " " + secondNum + " = " + result);
            }
            logger.info("Результат записан в файл: calcLogs.txt");
        }
        catch (FileNotFoundException e) {
        Logger.getLogger(e.getMessage());
        logger.info(e.getMessage());
        }
    }
}