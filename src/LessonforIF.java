
/**
 * Created by User on 5/26/2018.
 */
public class LessonforIF {
    public static void main(String[] args) {
        System.out.println(SquareIf(2,10));
        Promezhutok (10);
        Promezhutok (25);
        Promezhutok (200);

    }
    public static int SquareIf (int a, int b) {
        if (a%2==0) {
            int s = a*b/2;
            return s;
        } else {
            int s = a*b;
            return s;
        }
    }

    /*
    Написать функцию, которая выводит на экран в какой промежуток попадает число.
    Функция принимает один параметр А (целый) и выводит на экран в какой промежуток чисел попадает А.
    Функция ничего не возвращает.
    Промежутки:
    [0, 10)
    [10, 100)
    [100, 1000)
     */

    public static void Promezhutok (int a) {
        if (a>0 && a<10) {
            String x = "[0, 10)";
            System.out.println(x);
        }
        if (a>=10 && a<100) {
            System.out.println("[10, 100)");
        }
        if (a>=100 && a<1000) {
            System.out.println("[100, 1000)");
        }
    }
}
