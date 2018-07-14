public class Lesson11_14July2018 {

    public static void main(String[] args) {
        String s1 = "Anna likes to teach us living";
        String s2 = "I'm aiming to be a developer";
        String s3 = "Hello, World!";
        String s4 = "Четвертая переменная";
        String s5 = "abkaradabrararara";
        System.out.println(s1.length());
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        char c1 = 'a';
        char c2 = 'f';
        char c3 = '5';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        printA(123);
        printStr("абвг");

        printStr(s2.toUpperCase());
        printStr(s2.toLowerCase());

        printStr(s1.replace("A", "Ga"));
        printStr(s4.replace("Четвертая", "Энная"));
        printStr(s5.replace('a', 'e'));

        StringMulti_ABC(s1, s2, s3);

        printStr(doubleStr("АБ"));

        sumAndPrint(1, 2);

        sliceStr ("AБВГДЕ");

        sliceStr1 ("1234567890");


    }

    public static void printA(int A) {
        String s = String.format("перем. А = %d", A); //%d - это шаблон, %d - для целочисленных, %f - для дробей
        System.out.println(s);
    }

    public static void printStr(String A) {
        String b = String.format("строка А = \"%s\"", A); // %s - для строк String
        System.out.println(b);
    }

    public static void StringMulti_ABC(String A, String B, String C) {
        String Multi = String.format("перем А = '%s', перем B = '%s', перем C = '%s',", A, B, C);
        System.out.println(Multi);
    }

    public static String doubleStr(String a) {
        return String.format("замена String a на удвоенную = %s %s", a, a);
    }

    public static void sumAndPrint(int a, int b) {
        String Sum = String.format("%d + %d = %d", a, b, a + b);
        System.out.println(Sum);
    }

    public static void sliceStr (String a) {
        String Cut = a.substring(3);
        System.out.println(Cut);
    }

    public static void sliceStr1 (String a) {
        String Cut_a_half = a.substring(a.length()/2);
        System.out.println(Cut_a_half);
    }


}
