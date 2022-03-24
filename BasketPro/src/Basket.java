public class Basket {
    private String listBasket = "";
    private String nameBasket = "";
    private int countProductBasket;
    private static int countProductAllBasket;
    private double priceProductBasket;
    private static double priceProductAllBasket;
    private static String listAllBasket = "";
    private static int countBasket;

    public Basket(String nameBasket) {
        countBasket++;
        this.nameBasket = nameBasket;

    }

    /**
     * Название товара
     * Количество
     * Цена
     */


    //Добавить товар
    public void add(String nameProduct, int countProduct,double priceProduct) {
        listBasket = listBasket + System.lineSeparator()
                + nameProduct + " "
                + countProduct + " кол. "
                + priceProduct * countProduct + " руб.";

        countProductBasket = countProductBasket + countProduct;
        priceProductBasket = priceProductBasket + priceProduct*countProduct;

    }
    //Очистить корзину
    public void clear(){
        countProductBasket = 0;
        priceProductBasket = 0;
        listBasket = "";
    }
    //Вывести список товаров в корзине
    public void addListAllBasket(){
        countProductAllBasket = countProductAllBasket + countProductBasket;
        priceProductAllBasket = priceProductAllBasket + priceProductBasket;
        listAllBasket = listAllBasket + System.lineSeparator() + "Корзина " + nameBasket + ": " + listBasket;
         clear();
    }
    //Вывести общее количество товаров
    public static int getCountProductAllBasket(){
        return countProductAllBasket;
    }
    //Вывести общую сумму товаров в корзине
    public static double getPriceProductAllBasket(){
        return priceProductAllBasket;
    }
    //Добавить информацию о корзинах в пул корзин
    public static String getListAllBasket(){
        return listAllBasket;
    }

    //Вывести количество корзин
    public static int getCountBasket(){
        return countBasket;
    }

    public static String info() {
        return getListAllBasket() + "\n================================"
                + "\nОбщее количество корзин: " + getCountBasket() + " шт."
                + "\nОбщее количество товаров: " + getCountProductAllBasket() + " шт."
                + "\nОбщая стоимость товаров: " + getPriceProductAllBasket() + " руб."
                + "\nCредняя стоимость корзины: " + getPriceProductAllBasket() / getCountBasket() + " руб."
                + "\nCредняя стоимость товара: " + getPriceProductAllBasket() / getCountProductAllBasket() + " руб.";
    }
}
