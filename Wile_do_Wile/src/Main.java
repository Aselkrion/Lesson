import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int value = -1;

        while (value != 0) {
            value = new Scanner(System.in).nextInt();
            sum = sum + value;
        }
        System.out.println("Сумма чисел равна: " + sum);

        do {
            sum = sum + 10;
        } while (sum < 100);
        System.out.println("Сумма равна: " + sum);



    }
}
