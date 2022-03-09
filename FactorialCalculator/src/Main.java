import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value = new Scanner(System.in).nextInt();
        long a = 1L;
        long b;

        for( long i = 1L; i <= value; i++){
            b = i ;
            a = a * b;
        }
        System.out.println("Факториал равен: " + a);
    }
}
