package org.example.sem_2.homework;
/*
добавил ещё один catch, чтобы поймал исключение, если нет такого индекса
 */
public class Hw2 {
    public static void main(String[] args) {
        try {
            int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8};
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Нет элемента с таким индексом");
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
