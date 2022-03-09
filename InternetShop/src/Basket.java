public class Basket {
    private String items;
    private int totalPrice;
    private double totalWeight;
    private int limit;

    public Basket() {
        items = "Список товаров ";
        this.limit = 100_000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice, double totalWeight) {
        this();
        this.items = this.items + items;
        this.totalPrice = this.totalPrice + totalPrice;
        this.totalWeight = this.totalWeight + totalWeight;
    }

    public void add(String name, int price) {
        add(name, price, 1,1.0);
    }

    public void add(String name, int price, int count, double weight) {
        if (contains(name)) {
            return;
        }
        if (totalPrice + price * count >= limit) {
            return;
        }
        items = items + "\n" + name + " - " + count + " шт. " + price * count + " руб. " + weight * count + " кг.";
        totalPrice = totalPrice + price * count;
        totalWeight = totalWeight + weight * count;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
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

    public double getTotalWeight(){
        return totalWeight;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }
}
