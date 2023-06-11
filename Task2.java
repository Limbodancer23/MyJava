package HomeWork1;
// 2) Вывести все простые числа от 1 до 1000
public class Task2 {
    public static void main(String[] args) 
    {
        int count = 0;
        for (int i = 2; i < 1000; i++)
        {
            for (int j = 1; j < 1000; j++) {
                if (i % j == 0) count++;
            }
            if (count < 3) System.out.println(i);
            count = 0; 
        }
    }
}
