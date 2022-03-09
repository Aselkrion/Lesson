import java.util.Scanner;

public class Menu {

    public void menu() throws InterruptedException {
        int floor = 1;
        Elevator elevator = new Elevator(-3, 25, floor);
        while (true) {
            System.out.println("Нажмите СТАРТ - чтобы войти в лифт\n, " +
                    "либо нажмите СТОП, чтобы послать этот лифт в жопу");
            if (new Scanner(System.in).nextLine().equals("СТОП")) {
                System.out.println("Ну да я херовый лифт, чтоб вы себе ноги переломали, козлы");
                break;
            } else {
                System.out.println("На какой этаж вам надо?");
                elevator.controlPanel(new Scanner(System.in).nextInt());
                System.out.println("Текущее состояние лифта: " + elevator.getIntegrity() + " %");
            }
        }
    }

}
