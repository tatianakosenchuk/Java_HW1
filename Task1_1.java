// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

package HW1;

import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число \n");
        String ent = iScanner.nextLine();
        try {
            int num = Integer.parseInt(ent);
            int sum = 0;
            int fact = 1;
            for (int i = 1; i <= num; i++) {
                sum += i;
                fact *= i;

            }
            System.out.println(sum);
            System.out.println(fact);
        } catch (Exception e) {
            System.out.println("Ошибка ввода.");
        }
        iScanner.close();

    }
}
