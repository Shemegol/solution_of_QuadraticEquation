package com.shemegol;

import java.util.Scanner;
import java.lang.Math;


public class QuadraticEquation {

    private static Scanner sc = new Scanner(System.in).useDelimiter("[\r\n]+");

    public static void main(String[] args) {
        System.out.println("Решение квадратного уравнения a*x^2+b*x+c=0");
        double a = inputNum("a");
        double b = inputNum("b");
        double c = inputNum("c");
        if (a == 0) {
            findLineEquation(b, c);
        } else {
            double d = findDiscriminant(a, b, c);
            if (d > 0) {
                double x1 = (-b + Math.sqrt(d)) / 2 * a;
                double x2 = (-b - Math.sqrt(d)) / 2 * a;
                System.out.println("Уравнение имеет два различных вещественных корня:");
                System.out.println("\"x1\" равен " + x1);
                System.out.println("\"x2\"=" + x2);
            } else if (d == 0) {
                double x = -b / 2 * a;
                System.out.println("Уравнение имеет два совпадающих вещественных корня:");
                System.out.println("\"x1\"=\"x2\" и равны " + x);
            } else {
                System.out.println("Уравнение имеет два мнимых корня! Реализация их вычисления в разработке");
            }
        }
    }

    private static double inputNum(String n) { //Ввод числа с консоли. Как параметр указываеся имя константы.
        double k;
        while (true) {
            System.out.println("Введите \"" + n + "\" и нажмите Enter:");
            if (sc.hasNextDouble()) {
                k = sc.nextDouble();
                System.out.println("Ввод \"" + n + "\" закончен");
                break;
            } else {
                System.out.println("\"" + n + "\" должно быть числом!");
                sc.next();
            }
        }
        return k;
    }

    private static double findDiscriminant(double a, double b, double c) {
        double d;
        d = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Дискриминант равен " + d);
        return d;
    }

    private static void findLineEquation(double b, double c) {
        System.out.println("\"a\"=0. Решение уравнения \"b*x+c=0\"");
        if (b == 0 && c == 0) {
            System.out.println("\n\"x\" равен любому значению");
        } else if (b == 0) {
            System.out.println("\nРешений нет");
        } else if (c == 0) {
            System.out.println("\n\"x\" равен 0");
        } else {
            double x = -c / b;
            System.out.println("\n\"x\" равен " + x);
        }
    }
}
