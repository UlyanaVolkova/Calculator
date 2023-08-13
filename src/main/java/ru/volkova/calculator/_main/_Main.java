package ru.volkova.calculator._main;

import ru.volkova.calculator.service.ResultWriterService;

import java.util.Scanner;

import static ru.volkova.calculator.util.Calculator.*;

public class _Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = sum(a, b);
        ResultWriterService.printResult(a, b, result, "сумма", "+");
        result = subtract(a, b);
        ResultWriterService.printResult(a, b, result, "разность", "-");
        result = multiply(a, b);
        ResultWriterService.printResult(a, b, result, "произведение", "*");
    }
}
