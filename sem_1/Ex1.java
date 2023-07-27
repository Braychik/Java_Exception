package org.example.sem_1;

class Answer {
    public static void arrayOutOfBoundsException() {
        Integer[] array = {1,2,3,4};
        int e = array[5];

    }

    public static void divisionByZero() {
        int a1 = 5;
        int a2 = 0;
        int result = a1 / a2;

    }

    public static void numberFormatException() {
        String str = "number";
        int num = Integer.parseInt(str);

    }
}

public class Ex1 {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}