public class Main {

    public static void main(String[] args) {

        int coffeeAmount = 2330;
        int milkAmount = 100;
        int cappucinoMilkRequired = 60;
        int cappucinoCoffeeRequired = 50;
        int skimmedMilkAmount = 500;

        boolean isBlocked = false;

        if (!isBlocked && milkAmount >= cappucinoMilkRequired &&
                coffeeAmount >= cappucinoCoffeeRequired ||
                skimmedMilkAmount >= cappucinoMilkRequired) {
            System.out.println("готовим кофе");
        } else {
            System.out.println("Кофе-машина заблокирована");
        }

    }
}
