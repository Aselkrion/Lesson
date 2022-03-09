import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class InternalProcesses {


    //Cчетчик времени
    public static void timer() {
        //DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH.mm.ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        //System.out.println("Текущее время: " + localDateTime.format(dateTimeFormatter));
        int time = localDateTime.getSecond();
        while (true) {
            LocalDateTime localDateTime1 = LocalDateTime.now();
            int time1 = localDateTime1.getSecond();
            if (time1 == time + 1) {
                //System.out.println("Текущее время: " + localDateTime1.format(dateTimeFormatter));
                return;
            }
        }
    }


}
