public class Main {
    public static void main(String[] args) {
        Basket vasyaBasket = new Basket();
        vasyaBasket.add("Milk",80);
        vasyaBasket.add("Колбаса",900);
        vasyaBasket.add("Конфеты",200);

        Basket petyaBasket = new Basket(500);
        petyaBasket.add("Brod",45);
        petyaBasket.add("Шоколад",325);
        petyaBasket.add("Кумыс",150);

        Basket mashaBasket = new Basket("Стол", 5000);


        vasyaBasket.print("Корзина Васи: ");
        petyaBasket.print("Корзина Пети: ");
        mashaBasket.print("Корзина Маши: ");


    }
}
