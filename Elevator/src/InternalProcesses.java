import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Timer;


class InternalProcesses {


    //Cчетчик времени
    public static void timer() throws InterruptedException {
       Thread.sleep(1000);
    }

    public static double wear(){
        double wear = Math.random();
        if(wear < 0.2){
            return 2.75;
        }
        return 0;
    }




}
