public class Main {
    public static void main(String[] args) {
        int soughtYear = 1985;

        int firstYear = 1922;
        int lastYear = 2022;

        boolean yearExits = false;

        for (int year = firstYear; year <= lastYear; year++) {
            if (year % 4 != 0) {
                //Прерывает текущий и переходит к следующему
                continue;
            }
            System.out.println(year);

            for (int month = 1; month <= 12; month++) {
                String zero = month < 10 ? "0" : "";
                System.out.println("29." + zero + month + "." + year);
            }

//Прерывает весь цикл
            if (year == 2016) {
                yearExits = true;
                break;
            }

        }
        String found = "Год найден";
        String notFound = "Год не найден";
        System.out.println(yearExits ?found :notFound );
    }
}

