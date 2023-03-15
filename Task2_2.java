// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода в консоль:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.
package HW2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task2_2 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(
                new FileReader("/home/tatkosen/Рабочий стол/Учёба/Java/HW2/students.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] lst = line.replace("\"", "").replace(":", " ").replace(",", " ").replace("  ", " ").split(" ");
            sb.append("Студент ").append(lst[1]).append(" получил ").append(lst[3]).append(" по предмету ")
                    .append(lst[5]).append("\n");
        }
        System.out.print(sb);
        br.close();
    };
}
