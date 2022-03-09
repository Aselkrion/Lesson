import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value = new Random().nextInt(100);
        int index = 5;

        while (true) {
            System.out.println("У вас осталось: " + index + " попыток");
            System.out.println("Какое число я загадал?");
            int attempt = new Scanner(System.in).nextInt();

            if (attempt == value) {
                System.out.println("Вы угадали!");
                break;
            }

            if (attempt > value) {
                System.out.println("Загаданное число меньше");
            }

            if (attempt < value) {
                System.out.println("Загаданное число больше");
            }

            index--;
            if (index == 0) {
                System.out.println("Ваши попытки исчерпаны, вы проиграли");
                break;
            }
        }
    }
}
