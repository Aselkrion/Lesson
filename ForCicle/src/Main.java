import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value = new Scanner(System.in).nextInt();

        for (int i = 1; i <= value; i++) {
            for (int a = value; a > 0; a--) {
                if (i * a == value) {
                    System.out.println(i + " * " + a);
                }
            }
        }
    }
}

