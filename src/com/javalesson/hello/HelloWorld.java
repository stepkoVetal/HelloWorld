//пакет
package com.javalesson.hello;
//клас
public class HelloWorld {
  //метод, він головний і з нього починается виконання коду
    public static void main(String[] args) {
        System.out.println("Hello world!!!");
        byte b = 10;
        short c = 200;
        int a = b + 23;
        long myLongValue = 456_560_565_455L;
        float myFloatValue = 545.15F;
        double myDoubleValue = 222.47D;
        double sum = (double)(a + b + c) + myDoubleValue + (double)myFloatValue + (double)myLongValue;
        System.out.println("SuM = " + sum);
        float floatResult = myFloatValue / 3.0F;
        System.out.println("Float result = " + floatResult);
        double doubletResult = (double)(myFloatValue / 3.0F);
        System.out.println("Double result = " + doubletResult);
        char char1 = 'A';
        char char2 = 'b';
        char char3 = '\n';
        char char4 = '^';
        char char5 = 169;
        char char6 = 182;
        System.out.println("Characters");
        System.out.println("Char1 = " + char1);
        System.out.println("Char2 = " + char2);
        System.out.println("Char3 = " + char3);
        System.out.println("Char4 = " + char4);
        System.out.println("Char5 = " + char5);
        System.out.println("Char6 = " + char6);
        System.out.println("Sum characters");
        System.out.println(char1 + char2 + char3 + char4 + char5 + char6);
        System.out.println("Chars: " + char1 + char2 + char3 + char4 + char5 + char6);
        System.out.println("Число byte b = " + b);
        System.out.println("Число short c = " + c);
        System.out.println("Число int a = " + a);
        System.out.println("Число long myLongValue = " + myLongValue);
        System.out.println("Число long myFloatValue = " + myFloatValue);
        System.out.println("Число long myDoubleValue = " + myDoubleValue);
        boolean b1 = true;
        boolean b2 = false;
        String s = "some string some other string";
        System.out.println(s);
    }
}