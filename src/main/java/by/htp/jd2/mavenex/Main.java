package by.htp.jd2.mavenex;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number = enterInt("Введите четырехзначное число: ");
        int sumLastNumbers = sumLastTwoNumbers(number);
        int sumFirstNumbers = sumFirstTwoNumbers(number);
        boolean result = equalsSumTwoLastAndTwoSecondNumbers(sumFirstNumbers, sumLastNumbers);
        System.out.println(result);
    }

    public static int enterInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        while (!in.hasNextInt()) {
            in.nextLine();
            System.out.println("Введено не число!");
        }
        return in.nextInt();
    }

    public static boolean equalsSumTwoLastAndTwoSecondNumbers(int numberOne, int numberTwo) {
        boolean result;
        if (numberOne == numberTwo) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static int sumLastTwoNumbers(int number) {
        int sum;
        int fourthNumber = number % 10;
        number = number / 10;
        int thirdNumber = number % 10;
        sum = fourthNumber + thirdNumber;
        return sum;
    }

    public static int sumFirstTwoNumbers(int number) {
        int sum;
        number = number / 100;
        int secondNumber = number % 10;
        number = number / 10;
        int firstNumber = number % 10;
        sum = secondNumber + firstNumber;
        return sum;
    }

}

