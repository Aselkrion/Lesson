public class Main {

    public static void main(String[] args) {

        int coffeeAmount = 100;
        int milkAmount = 100;
        int cappucinoMilkRequired = 60;
        int cappucinoCoffeeRequired = 50;
        int skimmedMilkAmount = 500;
        int lowLactoseMilkAmount = 1000;

        boolean milkIsEnough = skimmedMilkAmount >= cappucinoMilkRequired ||
                milkAmount >= cappucinoMilkRequired ||
                lowLactoseMilkAmount >= cappucinoMilkRequired;

        boolean coffeeIsEnough = coffeeAmount >= cappucinoCoffeeRequired;

        boolean isBlocked = true;

        boolean hasErrors = false;

        if (isBlocked) {
            System.out.println("Кофе машина заблокирована");
            hasErrors = true;
        }

        if (!coffeeIsEnough) {
            System.out.println("Кофе недостаточно");
            hasErrors = true;
        }

        if (!milkIsEnough) {
            System.out.println("Молока недостаточно");
            hasErrors = true;
        }

        if (!hasErrors) {
            System.out.println("Готовим кофе");
        }

    }
}
