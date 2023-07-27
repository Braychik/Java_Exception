package org.example.sem_2.homework;

import java.util.Scanner;

public class Hw4 {
    public static void main(String[] args) {
        scanUser();
    }
    private static void scanUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое значение: ");
        String str = scanner.nextLine();
        try{
            chekUserStr(str);
            System.out.println(str);
        } catch (Exception ex){
            System.out.println("Попробуйте еще раз!");
            scanUser();
        }
    }
    public static String chekUserStr(String str){
        if (str.length() == 0){
            throw new RuntimeException("Пустые строки вводить нельзя!");
        }
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' '){
                count++;
                break;
            }
        }
        if (count == 0){
            throw new RuntimeException("Пустые строки вводить нельзя!");
        }
        return str;
    }
}
