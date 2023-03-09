// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

package HW1;

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число \n");
        String ent1 = iScanner.nextLine();
        System.out.printf("Введите знак '+ - / *' \n");
        String sign = iScanner.nextLine();
        System.out.printf("Введите второе число \n");
        String ent2 = iScanner.nextLine();
        iScanner.close();
        try {
            int num1 = Integer.parseInt(ent1);
            int num2 = Integer.parseInt(ent2);
            if (sign.equals("+")) {
                System.out.println(num1 + num2);
            } else if (sign.equals ("-")) {
                System.out.println(num1 - num2);
            } else if (sign.equals("/")) {
                System.out.println(num1 / num2);
            } else if (sign.equals("*")) {
                System.out.println(num1 * num2);
            }
        } catch (

        Exception e) {
            System.out.println("Ошибка ввода.");
        }
    }
}
