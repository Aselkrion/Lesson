import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Каков объем бассейна?");
        int volume = new Scanner(System.in).nextInt(); // литров

        int fillingSpeed = 30; // 30 литров в минуту приходит
        int devastationSpeed = 10; // 10 литров в минуту уходит

        int minute = 0;
        int volumePool = 0;

        do {
            volumePool = volumePool + (fillingSpeed - devastationSpeed);
            minute++;
        } while (volumePool < volume);
        System.out.println("Бассейн наполнится через: " + minute + " минут\n" +
                "Объём воды налитой в бассейн: " + volumePool + " литров.");
    }
}
