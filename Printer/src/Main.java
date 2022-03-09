import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "";
        String text = "";
        Printer printer = new Printer(name, text);

        while (true) {
            System.out.println("Введите заголовок текста: ");
            printer.setDocumentName(new Scanner(System.in).nextLine());
            if (printer.getDocumentName().equals("1")) {
                System.out.println("Принтер отключен");
                break;
            }
            System.out.println("Введите текст: ");
            printer.setDocumentText(new Scanner(System.in).nextLine());
            printer.append();
            System.out.println(printer.getTotalQueue());
            System.out.println("Количество страниц текста: " + printer.getNumberOfPages());
            System.out.println("Введите цифру 2 чтобы распечатать очередь: ");
            if (new Scanner(System.in).nextLine().equals("2")) {
                printer.printer();
                System.out.println(printer);
            } else {
                System.out.println(printer);
            }

        }
    }
}
