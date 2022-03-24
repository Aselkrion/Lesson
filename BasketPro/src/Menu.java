import java.util.Random;
import java.util.Scanner;

public class Menu {

    public static void menu() {
        while (true) {
            System.out.println("Кто покупатель: ");
            String name = new Scanner(System.in).nextLine();
            if (name.isEmpty()) {
                break;
            }
            Basket basket = new Basket(name);
            while (true) {
                System.out.println("Что покупаем: ");
                String product = new Scanner(System.in).nextLine();
                if (product.isEmpty()) {
                    basket.addListAllBasket();
                    break;
                }
                double price = new Random().nextDouble(1000.00);
                int count = new Random().nextInt(100);
                basket.add(product, count, price);
            }
        }
        System.out.println(Basket.info());

    }

}
