import java.awt.*;

/**
 * Created by User on 5/19/2018.
 */
public class GithubLesson {
    public static void main (String[] args)   {
            System.out.println(Pryamougolnik(1,2));
            System.out.println(Pryamougolnik(7,8));
            System.out.println(Pryamougolnik(9,10));
            System.out.println(Count2(5));
            System.out.println(Count2(-2));
            System.out.println(Count2(19));
            System.out.println(CountSin (45));
            System.out.println(Treugolnik(3,4, 90));
            System.out.println(Treugolnik(12,5,90));
            System.out.println(Treugolnik (15,16,180));
    }
    public static int symma2 (int a, int b) {
        int c = a+b;
        return c;
    }


    public static double Perimeter ( double a, double b) {
        return 2 * (a + b);}


    public static double f (double x) {
        double y = x*x - 1;
        return y;}


    /*
     1. Написать функцию расчета площади прямоугольника
     2. Написать функцию расчета х^3 + x^2 + 1
     3. Написать функцию расчета sin двойного угла

     4. Вызвать функцию в мейне из первого задания для значений 1 и 2 и вывести результат
     5. Вызвать функцию в мейне из первого задания для значений 7 и  8 и вывести результат, 9 и 10 и вывести результат.
     6. Вызвать функцию в мейне из второго задания для значений 5, -2, 19 и вывести результаты.
     7. Вызвать функцию в мейне из третьего задания для угла 45 градусов и вывести результат.

     8. Написать функцию расчета третьей стороны треугольника по двум другим и углу между ними
     double triC (double a, double b, double angle)....
     9. Вывести 8е задание на экран со значениями 3, 4, 90 = 5
     10. Вывести 8е задание на экран со значениями  12, 5, 90 = 13
     11. Вывести 8е задание на экран со значениями  15? 16? 180 = 31
     */

    public static double Pryamougolnik (double A, double B) {
        double C = A*B;
        return C;    }


    public static double Count2 (double x) {
        double y= Math.pow (x,3) + Math.pow (x,2) + 1;
        return y;
    }

    public static double CountSin (double Angle) {
        double y = Math.sin(2*Angle);
        return y;
    }

    public static double Treugolnik (double a, double b, int Angle) {
        double c = Math.sqrt (Math.pow (a,2) + Math.pow (b,2) - 2*a*b*Math.cos(Math.toRadians(Angle)));
        return c;
    }
}
