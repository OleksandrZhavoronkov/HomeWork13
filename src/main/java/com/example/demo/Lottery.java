package com.example.demo;
// Сделать два массива из 7-ми чисел, заполненных случайными цифрами (от 0 до 9).+
// Первый массив - это числа загаданные компанией(рэндом), которая организовывает лотерею.+
// Второй массив - это числа которые угадал игрок (вводим из консоли).+
// После того как оба массива заполнены цифрами, нужно отсортировать их по возрастанию любым способом.+
// В отсортированных массивах найти количество совпадений, т.е. чисел в двух массивах с одинаковым индексом; Например:
// first[3] должен быть равен second[3], как показано ниже.
// Пример вывода в консоль (совпали 1й, 4й и 6й элементы):
// [0, 1, 4, 5, 5, 8, 9]
// [1, 1, 2, 3, 5, 6, 9]
// Количество совпадений: 3
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Lottery {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to 1xbet :-)" + "\n" + "Please, enter 7 numbers to guess and win in Lottery: ");
        //Creating and initializing an array for User which will contain 7 elements
        int arraySize = 7;
        int[] userGuessLottery = new int[arraySize];
        //Calling method to fill the array in, with numbers from the user
        fillArray(userGuessLottery);
        //Creating and initializing an array for 7 elements (lottery array)
        int[] LotteryArray = new int[arraySize];
        //Calling method to fill this array in
        fill(LotteryArray);
        //Sorting arrays
        Arrays.sort(userGuessLottery);
        Arrays.sort(LotteryArray);
        //printing out user`s array and lottery arrays
        System.out.println("Your guess numbers: " + (Arrays.toString(userGuessLottery)));
        System.out.println("Lottery winning numbers: " + (Arrays.toString(LotteryArray)));
        //function to find digits in match and write them to the list + find match quantity
        int counter = 0; // counter which will be changed, once match found it will grow +1
        ArrayList <Integer> display = new ArrayList<>();//List to contain found elements from matching User`s and Lottery arrays

        //Cycle to find elements in match and write it down to the list
        for (int i = 0; i < LotteryArray.length; i++) {

            if (LotteryArray[i] == userGuessLottery[i]) {
                counter = counter + 1;
                display.add(i);
            }
        }
        //printing out the list of found elements (x,x,x)
        System.out.println("Those elements are in a match: " + Arrays.toString(display.toArray()));
        //printing out match quantity
        System.out.println("In match: " + counter);
    }
    //method for filling the array with random digits from 0-9
    public static void fill(int[] LotteryArray) {
        for (int i = 0; i < LotteryArray.length; i++) {
            LotteryArray[i] = (int) (Math.random() * 9);
        }
    }
    //method for filling User`s  array in + check ro enter digits in 0-9 diapason, in case not 0-9 starts from scratch
    public static void fillArray(int[] userGuessLottery) throws IOException {
        for (int i = 0; i < userGuessLottery.length; i++) {

            System.out.println("input " + i + " element: ");
            int input = Integer.parseInt(READER.readLine());
            if (input < 10 && input >= 0) { //Check input for 0-9 digits
                userGuessLottery[i] = input;
            } else {
                System.out.println("noway");
                fillArray(userGuessLottery);
                break;
            }
        }
    }
}