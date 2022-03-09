public class Main {
    public static void main(String[] args) {

        System.out.println("Информация о системе");
        System.out.print("Операционная система: ");
        System.out.println(System.getProperty("os.name") + " " + System.getProperty("os.version"));
        System.out.print("Количество ядер процессора: ");
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.print("Количество памяти, доступной JVM: ");
        System.out.println(Runtime.getRuntime().maxMemory() + "Mb");
        System.out.print("Свободная память: ");
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024 + "Mb");
        System.out.print("Вся память: ");
        System.out.println(Runtime.getRuntime().totalMemory() /1024 / 1024 + "Mb");

    }
}
