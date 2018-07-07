import java.util.Random;
import java.util.Scanner;

public class Lesson10 {
    public static void main(String[] args) {

       /* int[] A = inputArray(); // создали новый массив и сохранили ссылку на него - inputArray
        printArray (A);
*/
        int[] B = randomArray(5, 10);
        printArray(B);

        System.out.println(arraySum(B));

        System.out.println(arrayMax(B));

        System.out.println(arrayMin(B));

        System.out.println(arrayFind(B, 5));





        /*1. Используя "сканер" заполнить массив интов. Сначала ввести одно число - это количество элементов,
        затем создать массив из этого количества, и поочередно ввести числа в массив.
        Сопровождая каждое действие сообщением типа: Введите число элементов, Введите энное-число и так далее.
        Сделать все в отдельном методе под названием inputArray().
            public static int[] inputArray(); - этот метод будет возвращать сам созданный и введенный массив.
            int[] arr = new int[N];

         1a. Используя класс Random создать массив из случайных чисел.
        public static int[] randomArray (int N, int bound);
        Используя N для количества элементов в массиве и bound для генерации случайного числа в пределах [0;bound).

         2. Написать метод, который будет выводить переданный массив в параметре на консоль.
         public static void printArray(int[] arr); - в нем испрльзуется цикл и System.out вывести каждый
         элемент массива на экран [1, 2, 3, 4, 5]
         */
    }


    public static int[] inputArray() {      // 1е задание
        try (Scanner sc = new Scanner(System.in)) { // вызываю метод считывания числа с консоли
            System.out.println("Введите количество элементов: ");
            int N = sc.nextInt(); // cчитываю введенное число с консоли
            int[] arr = new int[N]; // создала массив, в котором количество элементов равно N
            for (int i = 0; i < arr.length; i++) { // создала цикл для перехода от первого элемента массива до последнего
                System.out.println("Введите элемент массива " + i);
                int M = sc.nextInt(); // считываю число, которое будет элементом массива
                arr[i] = M; // заношу введенное число в массив
            }
            return arr;
        }
    }

    public static int[] randomArray(int N, int bound) {     // 1а задание
        Random rnd = new Random(); // генерация случайного числа
        int[] arr = new int[N]; // создала массив, в котором количество элементов равно N
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(bound); // bound - промежуток, из которого выбирается случайное число
        }
        return arr;
    }

    public static void printArray(int[] arr) {       // 2е задание
        System.out.println("Выводим элементы массива");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /* 3. Написать метод, который будет считать сумму элементов массива.
    public static int arraySum(int[] arr);
     */

    public static int arraySum(int[] arr) {
        int sum = 0; // создаем точку отсчета
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i]; // можно записать как: sum+=arr[i]
        }
        return sum;
    }

    /*4. Написать метод,, который будет искать максимальный элемент массива.
    public static int arrayMax(int[] arr);
     */

    public static int arrayMax(int[] arr) {
        int max = arr[0];  // берем в качестве max первый элемент массива и далее проверяем его на правильность
        for (int i = 0; i < arr.length; i++) {  // проверяем каждый элемент массива от первого до последнего
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    /*5. Написать метод,, который будет искать минимальный элемент массива.
    public static int arrayMin(int[] arr);
     */

    public static int arrayMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) { //проходим по всем элементам цикла
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /* 6. написать метод, который будет искать заданный элемент в массиве и возвращать true, если элемент есть.
    public static boolean arrayFind(int[] arr, int value);
     */

    public static boolean arrayFind(int[] arr, int value) {
        boolean find = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                find = true;
            }
        }
        return find;
    }
}



