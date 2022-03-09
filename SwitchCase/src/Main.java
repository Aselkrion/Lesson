import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true){
            System.out.println("Введите сообщение");
            String input = new Scanner(System.in).nextLine();

            /**if(input.equals("Привет!")){
                System.out.println("Привет!)");
            } else if (input.equals("Как дела?")){
                System.out.println("Отлично! А как у тебя?");
            } else {
                System.out.println("Не понимаю вашего сообщения  :(");
            }*/

            switch (input) {
                case "Привет!" -> System.out.println("Привет!)");
                case "Как дела?" -> {
                    System.out.println("Отлично!)");
                    System.out.println("А как у тебя?");
                }
                default -> System.out.println("Не понимаю вашего сообщения  :(");
            }

        }

    }

}
