public class Multiplication {

    public static void main(String[] args) {
        int a = 1, b = 11;              // таблица умножения, for
        for (int i = a; i < b; i++) {
            for (int j = a; j < b; j++) {
                System.out.println(i + "*" + j + "=" + i* j);
            }
        }
     System.out.println(func(-1)); // switch, вариант первый
     System.out.println(func(0));
     System.out.println(func(1));
     System.out.println(func(2));
     System.out.println(func(3));
     System.out.println(func(4));
     System.out.println(func(5));

     int A = -1, B = 6;                 // switch, вариант второй
     for (int f = A; f < B; f++) {
         System.out.println(func(f));
     }

     Task3();
    }

    public static int func (int A) {      // switch, функция
      switch (A) {
          case 1: A+=1; break;   // в случае, если А=1
          case 2: A*=2; break;   // в случае, если А=2 (case 2)
          case 3: A*=4; break;   // и т.д.
          case 4: A/=2; break;
          default: A=0;
      }
      return A;
    }

    /* Задание 3
    Пройтись в цикле по значениям от 1 до 50.
    И вывести на консоль сообщение:
    Если число делится на 3 - "(число) делится на три"
    Если число делится на 5 - "(число) делится на пять"
    Если на 3 и на 5 - оба сообщения выше */

    public static void Task3 ()  {     //цикл от 1 до 50
        int A = 1, B = 51;
        for (int m = A; m < B; m = A++) {
            if (m%3==0) {
                System.out.println(m + "делится на три");
            }
            if (m%5==0) {
                System.out.println(m + "делится на пять");
            }
        }
    }

    /* Задание 4
    Написать функцию подсчета суммы элементов арифметической прогрессии начиная с первого элемента,
    шагом и номером последнего элемента. Через цикл. Функция суммы  n эелементов.
    Проверить с:
    а1 = 1, d = 1, n = 10
    а1 = 1, d = 3, n = 5
    а1 = 0, d = 5, n = 20

     public static int arifSum (int a1, int d, int n) {
     }
     */

    public static int arifSum (int a1, int d, int n) {
        int sum = 0;
        for (int a = a1, i=1; i<=n; i++, a+=d) {
            sum+=a;
        }
        return  sum;
    }


}
