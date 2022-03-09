import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();

        Arithmetic arithmetic = new Arithmetic(a,b);
        System.out.println("Сумма чисел равна: " + arithmetic.sumOfNumbers());
        System.out.println("Произведение чисел равно: " + arithmetic.productOfNumbers());
        System.out.println("Наибольшее число равно: " + arithmetic.maximumNumber());
        System.out.println("Наименьшее число равно: " + arithmetic.minimumNumber());

    }
}
