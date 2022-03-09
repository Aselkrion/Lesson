public class Basket {
    private String items;
    private int totalPrice;
    private int limit;

    public Basket() {
        items = "Список товаров ";
        this.limit = 100_000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = this.totalPrice + totalPrice;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {
        if (contains(name)) {
            return;
        }
        if (totalPrice + price * count >= limit) {
            return;
        }
        items = items + "\n" + name + " - " + count + " шт. " + price * count;
        totalPrice = totalPrice + price * count;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }
}
