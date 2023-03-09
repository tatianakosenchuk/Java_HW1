// Вывести все простые числа от 1 до 1000

package HW1;

public class Task1_2 {
    public static void main(String[] args) {
int lim=1000;
for(int i = 1;i<=lim;i++)
    {
    if (i==2||i==3||i%2!=0&&i%3!=0) {System.out.println(i);}}
}
}
