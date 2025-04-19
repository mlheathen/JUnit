package org.example;

public class Calc {

    public int summ(int a, int b) {
        int result = a + b;
        System.out.printf("Сумма %d и %d равна %d\n", a, b, result);
        System.out.println("Сумма " + a + " и " + b + " равна " + result);
        return result;
    }

    public int subtraction(int a, int b) {
        int result = a - b;
        System.out.printf("Разность %d и %d равна %d\n", a, b, result);
        System.out.println("Разность " + a + " и " + b + " равна " + result);
        return result;
    }
}
