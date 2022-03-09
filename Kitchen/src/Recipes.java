public class Recipes {

    /**
     * __________Домашние котлеты из фарша___________
     * Фарш мясной - 500 г
     * Яйцо - 1 шт.
     * Лук репчатый - 50 гр.
     * Хлеб - 80 г
     * Молоко - 50 г
     * Соль - 10 гр
     * Перец молотый - 0,025 гр.
     * Масло растительное - 30 мл
     *
     * ______Мясные котлеты с черемшой и плавленым сыром_____
     * Фарш мясной - 300 г
     * Черемша - 50 г
     * Сыр плавленый - 80 г
     * Лук репчатый - 50 г
     * Яйцо - 1 шт.
     * Сухари панировочные - 20 гр.
     * Хлеб - 100 гр
     * Соль - 10 гр
     * Перец молотый - 0,025 гр.
     * Масло растительное - 45 мл
     */
    private static int mincedMeat;
    private static int egg;
    private static int onion;
    private static int bread;
    private static int milk;
    private static int salt;
    private static double groundPepper;
    private static int sunflowerOil;
    private static int cheremsha;
    private static int processedCheese;
    private static int breadcrumbs;


    public Recipes(int mincedMeat, int egg, int onion, int bread,
                   int milk, int salt, double groundPepper, int sunflowerOil,
                   int cheremsha, int processedCheese, int breadcrumbs) {
        Recipes.mincedMeat = mincedMeat;
        Recipes.egg = egg;
        Recipes.onion = onion;
        Recipes.bread = bread;
        Recipes.milk = milk;
        Recipes.salt = salt;
        Recipes.groundPepper = groundPepper;
        Recipes.sunflowerOil = sunflowerOil;
        Recipes.cheremsha = cheremsha;
        Recipes.processedCheese = processedCheese;
        Recipes.breadcrumbs = breadcrumbs;

    }

    private static boolean possibilityMeatCutletsWithWildGarlicMeltedCheese(
            int mincedMeat, int egg, int onion, int bread,
            int salt, double groundPepper, int sunflowerOil,
            int cheremsha, int processedCheese, int breadcrumbs) {

        return mincedMeat >= 300 && egg >= 1 && onion >= 50 &&
                bread >= 100 && cheremsha >= 50 && salt >= 10 &&
                groundPepper >= 0.025 && sunflowerOil >= 45 && breadcrumbs >= 20 &&
                processedCheese >= 80;
    }

    private static boolean possibilityHomemadeMeatballs(
            int mincedMeat, int egg, int onion, int bread,
            int milk, int salt, double groundPepper, int sunflowerOil) {

        return mincedMeat >= 500 && egg >= 1 &&
                onion >= 50 && bread >= 80 && milk >= 50 &&
                salt >= 10 && groundPepper >= 0.025 &&
                sunflowerOil >= 30;
    }

    @Override
    public String toString() {

        String block = "";

        if (possibilityHomemadeMeatballs(mincedMeat, egg, onion, bread,
                milk, salt, groundPepper, sunflowerOil)) {
            block = block + "Готовим домашние котлеты из фарша" + System.lineSeparator();
        }

        if (possibilityMeatCutletsWithWildGarlicMeltedCheese(
                mincedMeat, egg, onion, bread,
                salt, groundPepper, sunflowerOil,
                cheremsha, processedCheese, breadcrumbs)) {
            block = block + "Готовим Мясные котлеты с черемшой и плавленым сыром" + System.lineSeparator();
        }

        if (!possibilityMeatCutletsWithWildGarlicMeltedCheese(
                mincedMeat, egg, onion, bread,
                salt, groundPepper, sunflowerOil,
                cheremsha, processedCheese, breadcrumbs) &&
                !possibilityHomemadeMeatballs(mincedMeat, egg, onion, bread,
                        milk, salt, groundPepper, sunflowerOil)) {
            block = block + "Не из чего готовить";
        }

        return block;

    }
}
