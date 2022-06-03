package ru.skypro5_2;

import java.util.*;

public class Main {
    static int[] arr = generateRandomArray();
    static int sum = 0, maxValue = 0, minValue = 0;
    static float averageValue = 0.0f;

    public static void main(String[] args) {
        task1();
        task2();
        task2_0();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
//        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void task1() {
        for (int j : arr) sum += j;
        System.out.println("Сумма трат за месяц составила: " + sum + " рублей.\n");
    }

    public static void task2() {
        int[] secondArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(secondArr);
        minValue = secondArr[0];
        maxValue = secondArr[secondArr.length - 1];
        System.out.println("Минимальная сумма трат за день составила: " + minValue + " рублей.");
        System.out.println("Максимальная сумма трат за день составила: " + maxValue + " рублей.\n");
    }

    public static void task2_0() {
        int maxValueSecond = 0, minValueSecond = arr[0];
        for (int j : arr) {
            if (j > maxValueSecond) {
                maxValueSecond = j;
            } else if (j < minValueSecond) {
                minValueSecond = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила: " + minValueSecond + " рублей.");
        System.out.println("Максимальная сумма трат за день составила: " + maxValueSecond + " рублей.\n");
    }

    public static void task3() {
        averageValue = (float) sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила: " + averageValue + " рублей.\n");
    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
