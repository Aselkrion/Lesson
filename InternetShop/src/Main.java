public class Main {
    public static void main(String[] args) {
        Basket vasyaBasket = new Basket();
        vasyaBasket.add("Молоко", 80, 10, 0.5);
        vasyaBasket.add("Колбаса", 900, 1, 1.0);
        vasyaBasket.add("Конфеты", 200, 50, 2.0);

        Basket petyaBasket = new Basket(500);
        petyaBasket.add("Хлеб", 45, 1, 0.7);
        petyaBasket.add("Шоколад", 325, 12, 5.0);
        petyaBasket.add("Кумыс", 150, 2, 1.4);


        vasyaBasket.print("Корзина Васи: ");
        System.out.println("Вес корзины Васи равен: " + vasyaBasket.getTotalWeight() + " кг.");
        System.out.println("Сумма  купленных Васей товаров равна: " + vasyaBasket.getTotalPrice() + " руб.");
        vasyaBasket.clear();
        petyaBasket.print("Корзина Пети: ");
        System.out.println("Вес корзины Васи равен: " + petyaBasket.getTotalWeight() + " кг.");
        System.out.println("Сумма  купленных Васей товаров равна: " + petyaBasket.getTotalPrice() + " руб.");
        petyaBasket.clear();

    }
}
