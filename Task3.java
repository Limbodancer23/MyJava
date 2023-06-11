package HomeWork1;
import java.util.Scanner;
// 3) Реализовать простой калькулятор (+-/*)
public class Task3 {
    public static void main(String[] args)
    {
        Scanner MyScan = new Scanner(System.in);
        Scanner MyScan1 = new Scanner(System.in);
        System.out.print("Enter first number: " );
        int num1 = MyScan.nextInt();
        System.out.print("Choose operation(+-/*): " );
        String Oper = MyScan1.nextLine();
        System.out.print("Enter second number: " );
        int num2 = MyScan.nextInt();
        System.out.println(NewCalk(num1, Oper, num2));
    }
    static int NewCalk(int a, String o, int b)
    {
        int res = 0;
        switch (o) {
            case "+": res = a + b;
                break;
            case "-": res = a - b;
                break;
            case "/": res = a / b;
                break;
            case "*": res = a * b;
                break;

            default: System.out.println("Error");
                break;
        }
        return res;
    }
}
