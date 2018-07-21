public class Lesson12_Last_21July2018
{

    public static void main(String[] args)
    {
        int[] AppleKorzina = new int[5];
        AppleKorzina[0] = 200;
        AppleKorzina[1] = 100;
        AppleKorzina[2] = 250;
        AppleKorzina[3] = 175;
        AppleKorzina[4] = 0;

        int Ves = 0;
        for (int i = 0; i < AppleKorzina.length; i++)
        {
            Ves += AppleKorzina[i];
            System.out.println(String.format("'%d', Вес соответствующего яблока '%d' -> Сумма веса '%d'",
                    i + 1, AppleKorzina[i], Ves));
        }
        System.out.println(Ves);

        /* Задание 1. Написать функцию, которая принимает массив в параметрах и возвращает сумму всех элементов.
             public static int arraySum (int[]A);

           Задание 2. Написать функцию, которая подсчитает количество не нулевых элементов в массиве,
             который передан в параментах функции.
             public static int arrayCount(int[]A);

           Задание 3. В мейне создать массив из 4 яблок. Присвоить им веса и подсчитать средний вес
           одного яблока в корзине используя функции из первых двух заданий.

           Задание 4. Создать функцию, которая выводит весь массив на экран.
           public static void pintArray (int[]A);
           В виде [1, 2, 3, 4,]

           Задание 5. Написать функцию, которая отнимает от каждого элемента массива заданное число.
           В мейне вызвать эту функцию с массивом и  потом вызвать printArray();
           public static void arrayDecrease (int[] A, int decreaseValue);

           Задание 6. Написать функцию, которая прибавляет к каждому элементу массива заданное число.
           public static void arrayIncrease (int[] A, int increaseValue);
           */

        System.out.println();

        int Task1 = arraySum(AppleKorzina);
        System.out.println(Task1);

        int Task2 = arrayCount(AppleKorzina);
        System.out.println(Task2);
        System.out.println(Task1 / Task2);

        System.out.println("Выводим весь массив на экран:");
        printArray(AppleKorzina);

        int N1 = 20;
        System.out.println("Уменьшаем значение элементов массива на 20:");
        arrayDecrease(AppleKorzina, N1);
        printArray(AppleKorzina); // обновленные данные после выполнения функции уменьшения элементов массива
        arrayDecrease(AppleKorzina, -N1); // возвращаем исходный результат по значениям элементов массива, не выводим на консоль

        System.out.println("Увеличиваем значение элементов массива на 50:");
        arrayIncrease (AppleKorzina, 50);
        printArray(AppleKorzina); // обновленные данные после выполнения функции увеличения элементов массива

        int N2 = 50;
        System.out.println("Увеличиваем значение элементов массива еще раз на 50:");
        arrayIncrease (AppleKorzina, N2);
        printArray(AppleKorzina); // обновленные данные после выполнения функции увеличения элементов массива дважды
    }

    public static int arraySum(int[] Korzina) // Задание 1
    {
        int SumWeight = 0;
        for (int i = 0; i < Korzina.length; i++)
        {
            SumWeight += Korzina[i];
        }
        return SumWeight;
    }

    public static int arrayCount(int[] A) // Задание 2
    {
        int Count = 0;
        for (int i = 0; i < A.length; i++)
        {
            if (A[i] != 0)   // != означает 'не равно'
            {
                Count++;
            }
        }
        return Count;
    }

    public static void printArray(int[] A) // Задание 4
    {
        System.out.print("[");
        for (int i = 0; i < A.length; i++)
        {
            System.out.print(A[i] + ", ");
        }
        System.out.println("]");
    }

    public static void arrayDecrease(int[] A, int decreaseValue) // Задание 5
    {
        for (int i = 0; i < A.length; i++)
        {
            A[i] = A[i] - decreaseValue;
        }
    }

    public static void arrayIncrease(int[] A, int increaseValue) // Задание 6
    {
        for (int i = 0; i < A.length; i++)
        {
            A[i] = A[i] + increaseValue;
        }
    }


}
