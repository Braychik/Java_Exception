package org.example.sem_2.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        numFloat();
    }

    private static void numFloat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число: ");
        try{
            double n = scanner.nextDouble();
            System.out.println(n);
        } catch (InputMismatchException e){
            System.out.println("Вы ввели неправильное число, попробуйте снова");
            numFloat();
        }
    }
}
