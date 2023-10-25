import org.w3c.dom.ls.LSOutput;

import java.lang.module.FindException;

public class Main {
    public static void main(String[] args) {
       task1 ();
       task2 ();
       task3 ();
       task4 ();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    private static void task1() {
        System.out.println("Задача 1");
        int [] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];}

            System.out.println("«Сумма трат за месяц составила " + sum + " рублей».\n");


    }
    private static void task2(){
        System.out.println("Задача 2");
        int maxsum = -1;
        int minsum = 200_001;
        int [] arr = generateRandomArray();
        for (int element : arr) {
            if (element > maxsum) {
                maxsum = element;
            }
            if (element < minsum) {
                minsum = element;
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+ minsum + " рублей. Максимальная сумма трат за день составила "+ maxsum + " рублей».");

    }
    private static void task3(){
        System.out.println("Задача 3");
        float sred = 0;
        float suma = 0;
        int [] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            suma += arr[i];
            sred = suma / 30;
        }
        System.out.println("«Сумма трат за месяц составила " + suma + " рублей».");
        System.out.println("Средняя сумма трат за месяц составила " + sred + " рублей");
    }
    private static void task4 () {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for ( int i = reverseFullName.length - 1; i >= 0; i--){

        System.out.print(reverseFullName [i]);}
    }

    }

