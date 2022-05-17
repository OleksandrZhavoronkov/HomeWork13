package com.example.demo;
// Сделать два массива из 7-ми чисел, заполненных случайными цифрами (от 0 до 9).
// Первый массив - это числа загаданные компанией(рэндом), которая организовывает лотерею.
// Второй массив - это числа которые угадал игрок (вводим из консоли).
// После того как оба массива заполнены цифрами, нужно отсортировать их по возрастанию любым способом.
// В отсортированных массивах найти количество совпадений, т.е. чисел в двух массивах с одинаковым индексом; Например:
// first[3] должен быть равен second[3], как показано ниже.
// Пример вывода в консоль (совпали 1й, 4й и 6й элементы):
// [0, 1, 4, 5, 5, 8, 9]
// [1, 1, 2, 3, 5, 6, 9]
// Количество совпадений: 3
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Lottery {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to 1xbet :-)" + "\n" + "Please, enter 7 numbers to guess and win in Lottery: ");
        //Creating and initializing an array for 7 elements
        int arraySize = 2;
        int[] userGuessLottery = new int[arraySize];
        //Filling the array in, with numbers from the user
        fillArray(userGuessLottery);





        //Displaying an initial array
        System.out.println("Your numbers to guess: " + (Arrays.toString(userGuessLottery)));


        /*int[] LotteryArray = new int[arraySize];
        fill(LotteryArray);*/

    }

    /*public static void fill(int[] LotteryArray) {
        for (int i = 0; i < LotteryArray.length; i++) {
            LotteryArray[i] = (int) (Math.random() * 9);
        }
    }*/

    public static void fillArray(int[] userGuessLottery) throws IOException {
        for (int i = 0; i < userGuessLottery.length; i++) {

            System.out.println("input " + i + " element: ");
            int input = Integer.parseInt(READER.readLine());
            if (input < 10 && input >= 0) {
                userGuessLottery[i] = input;
            } else {
                System.out.println("noway");

                fillArray(userGuessLottery);
                break;
            }

        }
    }

}




