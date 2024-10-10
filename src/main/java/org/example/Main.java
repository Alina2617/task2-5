package org.example;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        if (x <= -3) {
            // Вычисление y(x) = arctg(sqrt(|x|)) + 3 при x ≤ -3
            double y = Math.atan(Math.sqrt(Math.abs(x))) + 3;
            System.out.println("Значение y(x) = arctg(sqrt(|x|)) + 3 в заданной точке x: " + y);
        } else if (x > -3 && x < 3) {
            // Вычисление cos(x^5 + 2x/(3 + x^2)) в интервале -3 < x < 3
            double result = Math.cos(Math.pow(x, 5) + 2 * x / (3 + Math.pow(x, 2)));
            System.out.println("Значение функции cos(x^5 + 2x/(3 + x^2)) в заданной точке x: " + result);
        } else {
            // Вычисление x^4 + (3^-x) * x^(x-5) при x ≥ 3
            double value = Math.pow(x, 4) + Math.pow(3, -x) * Math.pow(x, x - 5);
            System.out.println("Значение функции x^4 + (3^-x) * x^(x-5) в заданной точке x: " + value);
        }
    }
}
