import java.util.Random;
import java.util.Scanner;

public class Lesson9 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int N = 10;
        int randNumber1 = rnd.nextInt(N);
        System.out.println(randNumber1);
        System.out.println(rnd.nextInt(N));
        System.out.println(rnd.nextInt(N));
        System.out.println(rnd.nextInt(N));
        System.out.println(rnd.nextInt(N));


// 2. Написать программу, которая выводит случайные числа от 0 до 10 - 5 раз. Используя класс "Random" и цикл "for".

        //   Random rnd = new Random(); - один раз указывается, если уже есть в мейне (выше)

        for (int i = 0; i < 5; i++) { // количество раз, сколько выполняется цикл - 5 раз (или (int i = 1; i <= 5; i++)
            int R = 11;
            int randNumber2 = rnd.nextInt(R);
            System.out.println(i + " " + randNumber2);
        }

        //Task3();

        // Массивы:
        int[] A = new int[5];
        A[0] = 1;
        int a = A[0];
        System.out.println(A[4]);
        System.out.println(A[0] + " " + a);
        System.out.println(A.length);

        /* 4. Создать массив из 3х элементов и найти сумму всех его элементов.
        Элементы задать вручную.
        */

        int[] B = new int[3];
        B[0] = 5;
        B[1] = 3;
        B[2] = 10;
        System.out.println(B[0] + B[1] + B[2]);

        int sum = 0;
        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
            sum += B[i];
        }
        System.out.println(sum);
        System.out.println (ArrayMax (B));

    }

/* 3. Написать программу угадай число, которая при запуске выбирает случайное число и предлагает пользователю его угадать
прося ввести число и говоря больше ли оно или меньше. Если  пользователь угадал, программа завершается.
Подсказка: лучше использовать цикл "do-while" для ввода числа с консоли. Случайное число взять из класса "Random".
Числа читать с консоли через "Сканер". от 1 по 10.
 */

    public static void Task3() {
        Random rnd = new Random();
        int N = 10; // Bound
        int Number = rnd.nextInt(N) + 1; // т.к. промежуток всегда [0; N-1], таким образом мы указали до 10, не до 9.
        // здесь мы загадали случайное число
        try (Scanner sc = new Scanner(System.in)) {
            // здесь ввод чисел с консоли
            int humanNumber;
            System.out.println("Я загадал. А ты пропробуй угадай!");
            do {
                System.out.println("Введи число: ");
                humanNumber = sc.nextInt(); // получили число
                if (humanNumber < Number) {
                    System.out.println("Ты не угадал! Мое число больше!");
                }
                if (humanNumber > Number) {
                    System.out.println("Ты не угадал! Мое число меньше!");
                }
            }
            while (Number != humanNumber);
            System.out.println("Ты угадал!");
        }
    }

    public static int sumArray (int[] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        return sum;
    }

     public static int ArrayMax (int[] A) {
         int max = 0;
         for (int i = 0; i < A.length; i++) {
             if (max == 0 || max < A[i]) {
                 max = A [i];
                 }
             }
             return max;
         }

     }

