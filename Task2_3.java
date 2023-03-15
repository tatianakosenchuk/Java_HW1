// К калькулятору из предыдущего дз добавить логирование.
// 1 + 3 = 4
// 4 + 3 = 7
package HW2;

import java.util.Scanner;
import java.util.logging.*;

public class Task2_3 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Task2_3.class.getName());
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);
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
                int result = num1 + num2;
                System.out.print(result+"\n");
                logger.info(num1 + " " + sign + " " + num2 + " = " + result);

            } else if (sign.equals("-")) {
                int result = num1 - num2;
                System.out.print(result+"\n");
                logger.info(num1 + " " + sign + " " + num2 + " = " + result);

            } else if (sign.equals("/")) {
                int result = num1 / num2;
                System.out.print(result+"\n");
                logger.info(num1 + " " + sign + " " + num2 + " = " + result);

            } else if (sign.equals("*")) {
                int result = num1 * num2;
                System.out.print(result+"\n");
                logger.info(num1 + " " + sign + " " + num2 + " = " + result);

            }
        } catch (

        Exception e) {
            System.out.println("Ошибка ввода.");
        }
    }
}
