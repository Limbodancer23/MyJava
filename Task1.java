package HomeWork1;

import java.util.Scanner;
// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number!: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(n);
        MyNum(n);
        System.out.printf("Answer: %d", MyNum(n));
    }

    static int MyNum(int num)
    {
        if (num == 1) return 1;
        return num + MyNum(num - 1);
    }

}
