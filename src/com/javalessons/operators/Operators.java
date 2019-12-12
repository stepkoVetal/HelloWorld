package com.javalesson.operators;

public class Operators {
    public static void main(String[] args) {
//        + - / * %
        int a = 10;
        int b = 3;

        int c = a + b;
        int d = a - b;

        int e = a * b;
        int f = a / b;
//  Приймає значення залишку від ділення а на b
        int g = a % b;
        System.out.println("Сумма c = " + c);
        System.out.println("Різниця d = " + d);
        System.out.println("Добуток e = " + e);
        System.out.println("Ділення f = " + f);
        System.out.println("Остача від ділення g = " + g);
        System.out.println("a = " + a);
        ++a;
        System.out.println("a2 = " + a);

//        Оператори порівняння ==, !=, >, <, <=, >=, &&, ||, :?
        int x = 3;
        int y = 5;
        int z = 6;
        boolean boolVal = x == y;
        System.out.println("boolVal = " + boolVal);

        int res = x < y ? x : y;
        System.out.println("res = " + res);

    }
}
