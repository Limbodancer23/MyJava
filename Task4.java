package HomeWork1;

// (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
//  Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
// Под знаком вопроса - всегда одинаковая ЦИФРА.
import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String q = "?5";
        String w = "4?";
        String e = "80";
        int a = 0;
        int b = 0;
        int c = Integer.parseInt(e);
        double count = 10;
        boolean flag = false;
        String res = q + w;
        String[] MyArr = new String[res.length()];
        for (int i = 0; i < MyArr.length; i++) {
            MyArr[i] = res.substring(i, i + 1);
            try {
                if (i < q.length()) {
                    count = Math.pow(10, q.length() - i - 1);
                    a += Integer.parseInt(MyArr[i]) * count;
                }
                if (i >= q.length()) {
                    count = Math.pow(10, MyArr.length - i - 1);
                    b += Integer.parseInt(MyArr[i]) * count;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("NumberFormatException: " + nfe.getMessage());
            }
        }
        System.out.println(Arrays.toString(MyArr));
        System.out.println("q  +  w =  e");
        System.out.printf("%d + %d = %d\n", a, b, c);
        System.out.println("------------------------");
        for (int j = 0; j < c; j++) {
            for (int k = 0; k < c; k++) {
                if (j + k == c
                        & a == Math.round(a * Math.pow(10, String.valueOf(a).length() - String.valueOf(a).length()))
                        & b == Math.round(b * Math.pow(10, String.valueOf(b).length() - String.valueOf(b).length()))) {
                    if (a >= 10 & (j / 10) * 10 == a & b >= 10 & (k / 10) * 10 == b || j == a & (k / 10) * 10 == b
                            || k == b & (j / 10) * 10 == a) {
                        System.out.printf("%d + %d = %d\n", j, k, c);
                        flag = true;
                    }
                    if (a >= 10 & (j / 10) * 10 == a & b < 10 & k % 10 == b
                            || a < 10 & j % 10 == a & b >= 10 & (k / 10) * 10 == b) {
                        System.out.printf("%d + %d = %d\n", j, k, c);
                        flag = true;
                    }
                    if (a < 10 & j % 10 == a & b < 10 & k % 10 == b || j == a & k % 10 == b || k == b & j % 10 == a) {
                        System.out.printf("%d + %d = %d\n", j, k, c);
                        flag = true;
                    }
                    if (a < 10 & (j / 10) * 10 == a & b >= 10 & (k / 10) * 10 == b) {
                        System.out.printf("%d + %d = %d\n", j, k, c);
                        flag = true;
                    }
                    if (a == 0 & k % 10 == b || a == 0 & (k / 10) * 10 == b || b == 0 & j % 10 == a
                            || b == 0 & (j / 10) * 10 == a) {
                        System.out.printf("%d + %d = %d\n", j, k, c);
                        flag = true;
                    }
                }
            }
        }
        if (flag == false) {
            System.out.println("Error");
        }
    }
}
