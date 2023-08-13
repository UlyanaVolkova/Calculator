package ru.volkova.calculator.service;

public class ResultWriterService {
    public static void printResult(int x, int y, int result, String typeOfOperation, String operationSign) {
        System.out.println(typeOfOperation + " " + x + " " + operationSign+ " " + y + " " + "=" + " " + result);
    }
}
