import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int floor = 1;
        Elevator elevator = new Elevator(-3, 25, floor);
       while (true){
        System.out.println("На какой этаж вам надо?");
        elevator.controlPanel(new Scanner(System.in).nextInt());
        }
    }
}
