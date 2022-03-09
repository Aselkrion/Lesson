public class Main {
    public static void main(String[] args) {
        boolean passIsValid = true;
        boolean inCarantine = true;

        //TODO тернарный оператор использовать когда есть только два условия

        String message = passIsValid && !inCarantine ?
                "Проход открыт" :  "Проход закрыт";

    }
}
