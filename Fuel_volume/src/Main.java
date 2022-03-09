import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Введите объем вашего бака");

        int gasTankVolume = s.nextInt();

        System.out.println("Сколько бензина вам налить?");

        int fuelQuantity = s.nextInt();

        if (fuelQuantity > gasTankVolume) {
            System.out.println("Слишком много бензина, укажите меньшее количество");
        } else {
            System.out.println("Вам налили " + fuelQuantity + " литров топлива \n" +
                    "в баке не хватает " + (gasTankVolume - fuelQuantity) + " литров топлива");
        }
    }
}
