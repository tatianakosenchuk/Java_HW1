// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), результат после каждой итерации запишите в лог-файл.
package HW2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.*;

public class Task2_1 {
    public static void BubbleSorting(int[] array) {
        try {
            Logger logger = Logger.getLogger(Task2_1.class.getName());
            FileHandler fh = new FileHandler("/home/tatkosen/Рабочий стол/Учёба/Java/HW2/log.txt");
            logger.addHandler(fh);
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);
            final int len = array.length;
            for (int i = 0; i < len - 1; i++) {
                for (int j = 0; j < len - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int tmp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = tmp;
                        logger.info(Arrays.toString(array));
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error");

        }
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter array length \n");
        int len = iScanner.nextInt();
        int[] array = new int[len];
        System.out.printf("Enter array elements \n");
        for (int i = 0; i < len; i++) {
            array[i] = iScanner.nextInt();
        }
        iScanner.close();
        BubbleSorting(array);
    }
}
