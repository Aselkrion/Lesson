import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double c = 0;
        Dimensions dimensions = new Dimensions(a, b, c);
        Cargo cargo = new Cargo(dimensions, 15, "Питер", true, "АБС3249", false);
        while (true) {
            dimensions = dimensions.setHeight(new Scanner(System.in).nextDouble());
            dimensions = dimensions.setWidth(new Scanner(System.in).nextDouble());
            dimensions = dimensions.setLength(new Scanner(System.in).nextDouble());
            cargo = cargo.setDimensions(dimensions);
            System.out.println(dimensions);
            System.out.println(cargo);
        }
    }
}


